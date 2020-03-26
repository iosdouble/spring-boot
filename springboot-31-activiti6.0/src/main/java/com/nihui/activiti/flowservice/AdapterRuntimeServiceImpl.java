package com.nihui.activiti.flowservice;

import com.nihui.activiti.process.MyProcessInstanceBuilderImpl;
import org.activiti.bpmn.model.FlowNode;
import org.activiti.engine.ActivitiIllegalArgumentException;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.activiti.engine.delegate.event.ActivitiEventType;
import org.activiti.engine.impl.cmd.StartProcessInstanceByMessageCmd;
import org.activiti.engine.impl.cmd.StartProcessInstanceCmd;
import org.activiti.engine.impl.persistence.entity.VariableInstance;
import org.activiti.engine.impl.runtime.ProcessInstanceBuilderImpl;
import org.activiti.engine.runtime.*;
import org.activiti.engine.task.Event;
import org.activiti.engine.task.IdentityLink;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Classname AdapterRuntimeServiceImpl
 * @Description TODO
 * @Date 2020/3/26 2:08 PM
 * @Created by nihui
 */
public class AdapterRuntimeServiceImpl implements RuntimeService {
    @Override
    public ProcessInstanceBuilder createProcessInstanceBuilder() {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByKey(String processDefinitionKey) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByKey(String processDefinitionKey, String businessKey) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByKey(String processDefinitionKey, Map<String, Object> variables) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByKey(String processDefinitionKey, String businessKey, Map<String, Object> variables) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByKeyAndTenantId(String processDefinitionKey, String tenantId) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByKeyAndTenantId(String processDefinitionKey, String businessKey, String tenantId) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByKeyAndTenantId(String processDefinitionKey, Map<String, Object> variables, String tenantId) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByKeyAndTenantId(String processDefinitionKey, String businessKey, Map<String, Object> variables, String tenantId) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceById(String processDefinitionId) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceById(String processDefinitionId, String businessKey) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceById(String processDefinitionId, Map<String, Object> variables) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceById(String processDefinitionId, String businessKey, Map<String, Object> variables) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByMessage(String messageName) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByMessageAndTenantId(String messageName, String tenantId) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByMessage(String messageName, String businessKey) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByMessageAndTenantId(String messageName, String businessKey, String tenantId) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByMessage(String messageName, Map<String, Object> processVariables) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByMessageAndTenantId(String messageName, Map<String, Object> processVariables, String tenantId) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByMessage(String messageName, String businessKey, Map<String, Object> processVariables) {
        return null;
    }

    @Override
    public ProcessInstance startProcessInstanceByMessageAndTenantId(String messageName, String businessKey, Map<String, Object> processVariables, String tenantId) {
        return null;
    }

    @Override
    public void deleteProcessInstance(String processInstanceId, String deleteReason) {

    }

    @Override
    public List<String> getActiveActivityIds(String executionId) {
        return null;
    }

    @Override
    public void trigger(String executionId) {

    }

    @Override
    public void trigger(String executionId, Map<String, Object> processVariables) {

    }

    @Override
    public void trigger(String executionId, Map<String, Object> processVariables, Map<String, Object> transientVariables) {

    }

    @Override
    public void updateBusinessKey(String processInstanceId, String businessKey) {

    }

    @Override
    public void addUserIdentityLink(String processInstanceId, String userId, String identityLinkType) {

    }

    @Override
    public void addGroupIdentityLink(String processInstanceId, String groupId, String identityLinkType) {

    }

    @Override
    public void addParticipantUser(String processInstanceId, String userId) {

    }

    @Override
    public void addParticipantGroup(String processInstanceId, String groupId) {

    }

    @Override
    public void deleteParticipantUser(String processInstanceId, String userId) {

    }

    @Override
    public void deleteParticipantGroup(String processInstanceId, String groupId) {

    }

    @Override
    public void deleteUserIdentityLink(String processInstanceId, String userId, String identityLinkType) {

    }

    @Override
    public void deleteGroupIdentityLink(String processInstanceId, String groupId, String identityLinkType) {

    }

    @Override
    public List<IdentityLink> getIdentityLinksForProcessInstance(String instanceId) {
        return null;
    }

    @Override
    public Map<String, Object> getVariables(String executionId) {
        return null;
    }

    @Override
    public Map<String, VariableInstance> getVariableInstances(String executionId) {
        return null;
    }

    @Override
    public List<VariableInstance> getVariableInstancesByExecutionIds(Set<String> executionIds) {
        return null;
    }

    @Override
    public Map<String, Object> getVariablesLocal(String executionId) {
        return null;
    }

    @Override
    public Map<String, VariableInstance> getVariableInstancesLocal(String executionId) {
        return null;
    }

    @Override
    public Map<String, Object> getVariables(String executionId, Collection<String> variableNames) {
        return null;
    }

    @Override
    public Map<String, VariableInstance> getVariableInstances(String executionId, Collection<String> variableNames) {
        return null;
    }

    @Override
    public Map<String, Object> getVariablesLocal(String executionId, Collection<String> variableNames) {
        return null;
    }

    @Override
    public Map<String, VariableInstance> getVariableInstancesLocal(String executionId, Collection<String> variableNames) {
        return null;
    }

    @Override
    public Object getVariable(String executionId, String variableName) {
        return null;
    }

    @Override
    public VariableInstance getVariableInstance(String executionId, String variableName) {
        return null;
    }

    @Override
    public <T> T getVariable(String executionId, String variableName, Class<T> variableClass) {
        return null;
    }

    @Override
    public boolean hasVariable(String executionId, String variableName) {
        return false;
    }

    @Override
    public Object getVariableLocal(String executionId, String variableName) {
        return null;
    }

    @Override
    public VariableInstance getVariableInstanceLocal(String executionId, String variableName) {
        return null;
    }

    @Override
    public <T> T getVariableLocal(String executionId, String variableName, Class<T> variableClass) {
        return null;
    }

    @Override
    public boolean hasVariableLocal(String executionId, String variableName) {
        return false;
    }

    @Override
    public void setVariable(String executionId, String variableName, Object value) {

    }

    @Override
    public void setVariableLocal(String executionId, String variableName, Object value) {

    }

    @Override
    public void setVariables(String executionId, Map<String, ?> variables) {

    }

    @Override
    public void setVariablesLocal(String executionId, Map<String, ?> variables) {

    }

    @Override
    public void removeVariable(String executionId, String variableName) {

    }

    @Override
    public void removeVariableLocal(String executionId, String variableName) {

    }

    @Override
    public void removeVariables(String executionId, Collection<String> variableNames) {

    }

    @Override
    public void removeVariablesLocal(String executionId, Collection<String> variableNames) {

    }

    @Override
    public Map<String, DataObject> getDataObjects(String executionId) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjects(String executionId, String locale, boolean withLocalizationFallback) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjectsLocal(String executionId) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjectsLocal(String executionId, String locale, boolean withLocalizationFallback) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjects(String executionId, Collection<String> dataObjectNames) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjects(String executionId, Collection<String> dataObjectNames, String locale, boolean withLocalizationFallback) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjectsLocal(String executionId, Collection<String> dataObjects) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjectsLocal(String executionId, Collection<String> dataObjectNames, String locale, boolean withLocalizationFallback) {
        return null;
    }

    @Override
    public DataObject getDataObject(String executionId, String dataObject) {
        return null;
    }

    @Override
    public DataObject getDataObject(String executionId, String dataObjectName, String locale, boolean withLocalizationFallback) {
        return null;
    }

    @Override
    public DataObject getDataObjectLocal(String executionId, String dataObjectName) {
        return null;
    }

    @Override
    public DataObject getDataObjectLocal(String executionId, String dataObjectName, String locale, boolean withLocalizationFallback) {
        return null;
    }

    @Override
    public ExecutionQuery createExecutionQuery() {
        return null;
    }

    @Override
    public NativeExecutionQuery createNativeExecutionQuery() {
        return null;
    }

    @Override
    public ProcessInstanceQuery createProcessInstanceQuery() {
        return null;
    }

    @Override
    public NativeProcessInstanceQuery createNativeProcessInstanceQuery() {
        return null;
    }

    @Override
    public void suspendProcessInstanceById(String processInstanceId) {

    }

    @Override
    public void activateProcessInstanceById(String processInstanceId) {

    }

    @Override
    public void signalEventReceived(String signalName) {

    }

    @Override
    public void signalEventReceivedWithTenantId(String signalName, String tenantId) {

    }

    @Override
    public void signalEventReceivedAsync(String signalName) {

    }

    @Override
    public void signalEventReceivedAsyncWithTenantId(String signalName, String tenantId) {

    }

    @Override
    public void signalEventReceived(String signalName, Map<String, Object> processVariables) {

    }

    @Override
    public void signalEventReceivedWithTenantId(String signalName, Map<String, Object> processVariables, String tenantId) {

    }

    @Override
    public void signalEventReceived(String signalName, String executionId) {

    }

    @Override
    public void signalEventReceived(String signalName, String executionId, Map<String, Object> processVariables) {

    }

    @Override
    public void signalEventReceivedAsync(String signalName, String executionId) {

    }

    @Override
    public void messageEventReceived(String messageName, String executionId) {

    }

    @Override
    public void messageEventReceived(String messageName, String executionId, Map<String, Object> processVariables) {

    }

    @Override
    public void messageEventReceivedAsync(String messageName, String executionId) {

    }

    @Override
    public void addEventListener(ActivitiEventListener listenerToAdd) {

    }

    @Override
    public void addEventListener(ActivitiEventListener listenerToAdd, ActivitiEventType... types) {

    }

    @Override
    public void removeEventListener(ActivitiEventListener listenerToRemove) {

    }

    @Override
    public void dispatchEvent(ActivitiEvent event) {

    }

    @Override
    public void setProcessInstanceName(String processInstanceId, String name) {

    }

    @Override
    public List<FlowNode> getEnabledActivitiesFromAdhocSubProcess(String executionId) {
        return null;
    }

    @Override
    public Execution executeActivityInAdhocSubProcess(String executionId, String activityId) {
        return null;
    }

    @Override
    public void completeAdhocSubProcess(String executionId) {

    }

    @Override
    public List<Event> getProcessInstanceEvents(String processInstanceId) {
        return null;
    }

    public ProcessInstance startProcessInstance(MyProcessInstanceBuilderImpl processInstanceBuilder) {
        return null;

    }
}
