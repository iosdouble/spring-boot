package com.nihui.restlog.log.eventlog.aop;

import com.nihui.restlog.bean.ExceptionMsg;
import com.nihui.restlog.bean.ResultResp;
import com.nihui.restlog.bean.ResultRespStatus;
import com.nihui.restlog.log.contants.LogAppenderName;
import com.nihui.restlog.log.contants.LogType;
import com.nihui.restlog.log.eventlog.bean.EventLogBean;
import com.nihui.restlog.log.eventlog.contants.EventLogLevel;
import com.nihui.restlog.log.eventlog.contants.EventLogType;
import com.nihui.restlog.util.*;
import com.nihui.restlog.util.exception.ParentException;
import com.nihui.restlog.util.exception.ParentRuntimeException;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.UUID;

/**
 * @Classname RestLogAspect
 * @Description TODO
 * @Date 2020/3/25 11:44 AM
 * @Created by nihui
 */
public class RestLogAspect {
    protected final transient Logger eventlogger = LoggerFactory.getLogger(LogAppenderName.EVENT);
    protected final transient Logger systemExceptionlogger = LoggerFactory.getLogger(LogAppenderName.EXCEPTION_SYSTEM);

    @Value("${cat.support.log.restlog.component:未知}")
    private String component;
    @Value("${cat.support.log.restlog.subSystem:未知}")
    private String subSystem;
    @Value("${cat.support.log.restlog.framework:未知}")
    private String framework="SpringCloud";

    private String logType = LogType.EVENT;
    private String eventLogType = EventLogType.API_EXECUTE;
    private String hostname = EnvironmentUtil.getHostName();

    private EventLogBean eventLogBean;

    private long eventLogStartExecuteTime;//日志开始执行的时间

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    private String REGEX_API_VERSION="v[0-9]{0,1}";

    @Pointcut("!@within(com.nihui.restlog.log.eventlog.aop.IgnoreRestLog) && !@annotation(com.nihui.restlog.log.eventlog.aop.IgnoreRestLog)  && (@annotation(com.nihui.restlog.log.eventlog.aop.RestLog) || @within(com.nihui.restlog.log.eventlog.aop.RestLog))")
    public void restAspect() {
    }


    @Around("restAspect()")
    public Object doRestAspectAround(ProceedingJoinPoint joinPoint) throws Throwable {
        eventLogBean = new EventLogBean();
        eventLogStartExecuteTime = System.currentTimeMillis();

        Object object = null;

        long apiStartTime = System.currentTimeMillis();
        object = joinPoint.proceed();
        long apiEndTime = System.currentTimeMillis();
        long apiExecuteTime = apiEndTime - apiStartTime;
        eventLogBean.setApiExecutionTime(apiExecuteTime);

        return object;
    }

    @Before("restAspect()")
    public void doRestAspectBefore(JoinPoint joinPoint) {

        eventLogBean.setLogType(logType);
        eventLogBean.setHostname(hostname);
        eventLogBean.setTimetamp(sdf.format(System.currentTimeMillis()));//执行完需要不全

        eventLogBean.setComponent(component);
        eventLogBean.setSubSystem(subSystem);
        eventLogBean.setFramework(framework);
        RequestAttributes requestAttributes=RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletContainer = (ServletRequestAttributes) requestAttributes;
        HttpServletRequest httpServletRequest = servletContainer.getRequest();
        eventLogBean.setClientIp(IpUtil.getRequestClientIp(httpServletRequest));

        eventLogBean.setEventLogLevel(EventLogLevel.INFO);
        eventLogBean.setEventLogType(eventLogType);
        String logId = UUID.randomUUID().toString();
        eventLogBean.setEventLogId(logId);
        ThreadLocalUtil.getInstance().set(logId);
        eventLogBean.setEventLogExecutionTime(-1);//执行完需要不全

        eventLogBean.setHttpMethod(httpServletRequest.getMethod());
        eventLogBean.setClazzName(joinPoint.getTarget().getClass().getName());
        eventLogBean.setMethodName(joinPoint.getSignature().getName());
        eventLogBean.setApiName(httpServletRequest.getRequestURI());
        eventLogBean.setApiVersion(RegexUtil.getRegexFirstPartStr(httpServletRequest.getRequestURI(), REGEX_API_VERSION));
        eventLogBean.setApiParams(reqPathParams2Json(httpServletRequest));
        eventLogBean.setApiExecutionTime(-1);//执行完需要不全

    }


    @AfterReturning(value = "restAspect()", returning = "result")
    public void doRestAspectAfterReturning(JoinPoint joinPoint, Object result) {
        if (result != null) {
            if(ResultResp.class.isAssignableFrom(result.getClass())) {
                recordResultRespResponse(result);
            }
            else if(ResponseEntity.class.isAssignableFrom(result.getClass())) {
                recordResponseEntity(result);
            }else if(Response.class.isAssignableFrom(result.getClass())){
                recordJerseyResponse(result);
            }
        }

        long eventLogEndExecuteTime = System.currentTimeMillis();
        long eventLogExecuteTime = eventLogEndExecuteTime - eventLogStartExecuteTime - eventLogBean.getApiExecutionTime();
        eventLogBean.setEventLogExecutionTime(eventLogExecuteTime);

        eventlogger.info(JsonUtil.toJson(eventLogBean));
    }

    @AfterThrowing(pointcut = "restAspect()", throwing = "e")
    public void doRestAspectAfterThrowing(JoinPoint joinPoint, Throwable e) {
        if (e != null) {
            if(ParentException.class.isAssignableFrom(e.getClass())) {

            }else if(ParentRuntimeException.class.isAssignableFrom(e.getClass())) {

            }else {
                systemExceptionlogger.error("系统运行发生异常", e);
                if(e.getCause()!=null) {
                    eventLogBean.setErrorMsg(e.getCause().getMessage());
                }else {
                    eventLogBean.setErrorMsg(e.getMessage());
                }
            }
        }

        eventLogBean.setEventLogLevel(EventLogLevel.EXCEPTION);

        long eventLogEndExecuteTime = System.currentTimeMillis();
        long eventLogExecuteTime = eventLogEndExecuteTime - eventLogStartExecuteTime - eventLogBean.getApiExecutionTime();
        eventLogBean.setEventLogExecutionTime(eventLogExecuteTime);

        eventlogger.info(JsonUtil.toJson(eventLogBean));

    }

    @SuppressWarnings("unchecked")
    private void recordResultRespResponse(Object result) {
        ResultResp<String> resultResp = (ResultResp<String>) result;

        int httpStatus = HttpServletResponse.SC_OK;
        eventLogBean.setHttpStatus(httpStatus + "");

        String status=resultResp.getStatus();
        if(ResultRespStatus.EXCEPTION.equals(status)) {
            eventLogBean.setEventLogLevel(EventLogLevel.EXCEPTION);

            ExceptionMsg exceptionBean = resultResp.getExceptionMsg();
            eventLogBean.setErrorId(exceptionBean.getErrorId());
            eventLogBean.setErrorCode(exceptionBean.getErrorCode() + "");
            eventLogBean.setErrorMsg(exceptionBean.getErrorMsg());
        }else if(ResultRespStatus.ERROR.equals(status)) {
            eventLogBean.setEventLogLevel(EventLogLevel.ERROR);

            ExceptionMsg exceptionBean = resultResp.getExceptionMsg();
            eventLogBean.setErrorId(exceptionBean.getErrorId());
            eventLogBean.setErrorCode(exceptionBean.getErrorCode() + "");
            eventLogBean.setErrorMsg(exceptionBean.getErrorMsg());
        }
    }

    @SuppressWarnings("unchecked")
    private void recordResponseEntity(Object result) {
        ResponseEntity<String> responseEntity = (ResponseEntity<String>) result;
        int httpStatus = responseEntity.getStatusCodeValue();
        eventLogBean.setHttpStatus(httpStatus + "");
        if (httpStatus >= 400 && result != null) {
            eventLogBean.setEventLogLevel(EventLogLevel.ERROR);
            if(StringUtils.isNotBlank(responseEntity.getBody())){
                ExceptionMsg exceptionBean = JsonUtil.toObject(responseEntity.getBody(), ExceptionMsg.class);
                if(exceptionBean!=null){
                    eventLogBean.setErrorId(exceptionBean.getErrorId());
                    eventLogBean.setErrorCode(exceptionBean.getErrorCode() + "");
                    eventLogBean.setErrorMsg(exceptionBean.getErrorMsg());
                }
            }
        }
    }


    private void recordJerseyResponse(Object result) {
        Response response = (Response) result;
        int httpStatus = response.getStatus();
        eventLogBean.setHttpStatus(httpStatus + "");
        if (httpStatus >= 400 && result != null) {
            eventLogBean.setEventLogLevel(EventLogLevel.ERROR);
            Object entity=response.getEntity();
            if(entity!=null&&String.class.isAssignableFrom(entity.getClass())){
                ExceptionMsg exceptionBean = JsonUtil.toObject(entity+"", ExceptionMsg.class);
                if(exceptionBean!=null){
                    eventLogBean.setErrorId(exceptionBean.getErrorId());
                    eventLogBean.setErrorCode(exceptionBean.getErrorCode() + "");
                    eventLogBean.setErrorMsg(exceptionBean.getErrorMsg());
                }
            }
        }
    }


    private String reqPathParams2Json(HttpServletRequest httpServletRequest) {
        Map<String, String[]> params = httpServletRequest.getParameterMap();
        Map<String, String[]> newParams =null;
        String newParamsJson = null;
        if (params != null && params.size() > 0) {
            // cleartextPassword
            newParams = MapUtil.removeEntities(params, new String[] { "cleartextPassword" });
            newParamsJson = JsonUtil.toJson(newParams);
        }
        return newParamsJson;
    }
}
