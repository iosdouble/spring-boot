package com.nihui.activiti.flowservice;

import org.activiti.engine.HistoryService;
import org.activiti.engine.history.*;

import java.util.List;

/**
 * @Classname AdapterHistoryServiceImpl
 * @Description TODO
 * @Date 2020/3/26 2:29 PM
 * @Created by nihui
 */
public class AdapterHistoryServiceImpl implements HistoryService {
    @Override
    public HistoricProcessInstanceQuery createHistoricProcessInstanceQuery() {
        return null;
    }

    @Override
    public HistoricActivityInstanceQuery createHistoricActivityInstanceQuery() {
        return null;
    }

    @Override
    public HistoricTaskInstanceQuery createHistoricTaskInstanceQuery() {
        return null;
    }

    @Override
    public HistoricDetailQuery createHistoricDetailQuery() {
        return null;
    }

    @Override
    public NativeHistoricDetailQuery createNativeHistoricDetailQuery() {
        return null;
    }

    @Override
    public HistoricVariableInstanceQuery createHistoricVariableInstanceQuery() {
        return null;
    }

    @Override
    public NativeHistoricVariableInstanceQuery createNativeHistoricVariableInstanceQuery() {
        return null;
    }

    @Override
    public void deleteHistoricTaskInstance(String taskId) {

    }

    @Override
    public void deleteHistoricProcessInstance(String processInstanceId) {

    }

    @Override
    public NativeHistoricProcessInstanceQuery createNativeHistoricProcessInstanceQuery() {
        return null;
    }

    @Override
    public NativeHistoricTaskInstanceQuery createNativeHistoricTaskInstanceQuery() {
        return null;
    }

    @Override
    public NativeHistoricActivityInstanceQuery createNativeHistoricActivityInstanceQuery() {
        return null;
    }

    @Override
    public List<HistoricIdentityLink> getHistoricIdentityLinksForTask(String taskId) {
        return null;
    }

    @Override
    public List<HistoricIdentityLink> getHistoricIdentityLinksForProcessInstance(String processInstanceId) {
        return null;
    }

    @Override
    public ProcessInstanceHistoryLogQuery createProcessInstanceHistoryLogQuery(String processInstanceId) {
        return null;
    }
}
