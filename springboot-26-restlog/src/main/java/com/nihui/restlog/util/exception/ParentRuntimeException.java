package com.nihui.restlog.util.exception;

import com.nihui.restlog.bean.ExceptionMsg;
import com.nihui.restlog.util.JsonUtil;



/**
 * 
 * @author 王云龙
 * @date 2017年1月18日 下午3:07:02
 * @version 1.0
 * @description 框架级别的exception父类
 *
 */
public abstract class ParentRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 713616801491210431L;
	
	private ExceptionMsg exceptionMsg=new ExceptionMsg();
	
	
	public ParentRuntimeException(ExceptionMsg exceptionMsg) {
		super();
		this.exceptionMsg = exceptionMsg;
	}
	
	public ParentRuntimeException(String errorCode ,String errorMsg) {
//		exceptionMsg.setErrorId(ExceptionIdUtil.getId());
		exceptionMsg.setErrorCode(errorCode);
		exceptionMsg.setErrorMsg(errorMsg);
	}
	
	public ExceptionMsg getExceptionMsg(){
		return this.exceptionMsg;
	}
	
	public void setErrorId(String errorId) {
		this.exceptionMsg.setErrorId(errorId);
	}
	
	public void setErrorCode(String projectErrorCode) {
		String errorCode=this.exceptionMsg.getErrorCode();
		errorCode = projectErrorCode+"-"+errorCode;
		this.exceptionMsg.setErrorCode(errorCode);
	}
	
	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月17日 下午8:30:34
	 * @version 1.0
	 * @description 将ParentException中的信息json化
	 * @return
	 */
	private String toJson(){
//		if(StringUtils.isBlank(exceptionMsg.getErrorId())){
//			exceptionMsg.setErrorId(ExceptionIdUtil.getId());
//		}
		String responseStr=JsonUtil.toJson(exceptionMsg);
		return responseStr;
	}
	
	/**
	 * 重写Exception.getMessage()，返回规定的json格式异常
	 */
	@Override
	public String getMessage() {
		return toJson();
	}

}
