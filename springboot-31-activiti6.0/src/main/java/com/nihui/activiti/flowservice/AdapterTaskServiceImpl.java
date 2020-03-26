package com.nihui.activiti.flowservice;

import org.activiti.engine.TaskService;
import org.activiti.engine.impl.persistence.entity.VariableInstance;
import org.activiti.engine.runtime.DataObject;
import org.activiti.engine.task.*;

import java.io.InputStream;
import java.util.*;

/**
 * @Classname AdapterTaskServiceImpl
 * @Description TODO
 * @Date 2020/3/26 2:06 PM
 * @Created by nihui
 */
public class AdapterTaskServiceImpl implements TaskService {
    @Override
    public Task newTask() {
        return null;
    }

    @Override
    public Task newTask(String s) {
        return null;
    }

    @Override
    public void saveTask(Task task) {

    }

    @Override
    public void deleteTask(String s) {

    }

    @Override
    public void deleteTasks(Collection<String> collection) {

    }

    @Override
    public void deleteTask(String s, boolean b) {

    }

    @Override
    public void deleteTasks(Collection<String> collection, boolean b) {

    }

    @Override
    public void deleteTask(String s, String s1) {

    }

    @Override
    public void deleteTasks(Collection<String> collection, String s) {

    }

    @Override
    public void claim(String s, String s1) {

    }

    @Override
    public void unclaim(String s) {

    }

    @Override
    public void complete(String s) {

    }

    @Override
    public void delegateTask(String s, String s1) {

    }

    @Override
    public void resolveTask(String s) {

    }

    @Override
    public void resolveTask(String s, Map<String, Object> map) {

    }

    @Override
    public void resolveTask(String s, Map<String, Object> map, Map<String, Object> map1) {

    }

    @Override
    public void complete(String s, Map<String, Object> map) {

    }

    @Override
    public void complete(String s, Map<String, Object> map, Map<String, Object> map1) {

    }

    @Override
    public void complete(String s, Map<String, Object> map, boolean b) {

    }

    @Override
    public void setAssignee(String s, String s1) {

    }

    @Override
    public void setOwner(String s, String s1) {

    }

    @Override
    public List<IdentityLink> getIdentityLinksForTask(String s) {
        return null;
    }

    @Override
    public void addCandidateUser(String s, String s1) {

    }

    @Override
    public void addCandidateGroup(String s, String s1) {

    }

    @Override
    public void addUserIdentityLink(String s, String s1, String s2) {

    }

    @Override
    public void addGroupIdentityLink(String s, String s1, String s2) {

    }

    @Override
    public void deleteCandidateUser(String s, String s1) {

    }

    @Override
    public void deleteCandidateGroup(String s, String s1) {

    }

    @Override
    public void deleteUserIdentityLink(String s, String s1, String s2) {

    }

    @Override
    public void deleteGroupIdentityLink(String s, String s1, String s2) {

    }

    @Override
    public void setPriority(String s, int i) {

    }

    @Override
    public void setDueDate(String s, Date date) {

    }

    @Override
    public TaskQuery createTaskQuery() {
        return null;
    }

    @Override
    public NativeTaskQuery createNativeTaskQuery() {
        return null;
    }

    @Override
    public void setVariable(String s, String s1, Object o) {

    }

    @Override
    public void setVariables(String s, Map<String, ?> map) {

    }

    @Override
    public void setVariableLocal(String s, String s1, Object o) {

    }

    @Override
    public void setVariablesLocal(String s, Map<String, ?> map) {

    }

    @Override
    public Object getVariable(String s, String s1) {
        return null;
    }

    @Override
    public <T> T getVariable(String s, String s1, Class<T> aClass) {
        return null;
    }

    @Override
    public VariableInstance getVariableInstance(String s, String s1) {
        return null;
    }

    @Override
    public boolean hasVariable(String s, String s1) {
        return false;
    }

    @Override
    public Object getVariableLocal(String s, String s1) {
        return null;
    }

    @Override
    public <T> T getVariableLocal(String s, String s1, Class<T> aClass) {
        return null;
    }

    @Override
    public VariableInstance getVariableInstanceLocal(String s, String s1) {
        return null;
    }

    @Override
    public boolean hasVariableLocal(String s, String s1) {
        return false;
    }

    @Override
    public Map<String, Object> getVariables(String s) {
        return null;
    }

    @Override
    public Map<String, VariableInstance> getVariableInstances(String s) {
        return null;
    }

    @Override
    public Map<String, VariableInstance> getVariableInstances(String s, Collection<String> collection) {
        return null;
    }

    @Override
    public Map<String, Object> getVariablesLocal(String s) {
        return null;
    }

    @Override
    public Map<String, Object> getVariables(String s, Collection<String> collection) {
        return null;
    }

    @Override
    public Map<String, Object> getVariablesLocal(String s, Collection<String> collection) {
        return null;
    }

    @Override
    public List<VariableInstance> getVariableInstancesLocalByTaskIds(Set<String> set) {
        return null;
    }

    @Override
    public Map<String, VariableInstance> getVariableInstancesLocal(String s) {
        return null;
    }

    @Override
    public Map<String, VariableInstance> getVariableInstancesLocal(String s, Collection<String> collection) {
        return null;
    }

    @Override
    public void removeVariable(String s, String s1) {

    }

    @Override
    public void removeVariableLocal(String s, String s1) {

    }

    @Override
    public void removeVariables(String s, Collection<String> collection) {

    }

    @Override
    public void removeVariablesLocal(String s, Collection<String> collection) {

    }

    @Override
    public Map<String, DataObject> getDataObjects(String s) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjects(String s, String s1, boolean b) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjects(String s, Collection<String> collection) {
        return null;
    }

    @Override
    public Map<String, DataObject> getDataObjects(String s, Collection<String> collection, String s1, boolean b) {
        return null;
    }

    @Override
    public DataObject getDataObject(String s, String s1) {
        return null;
    }

    @Override
    public DataObject getDataObject(String s, String s1, String s2, boolean b) {
        return null;
    }

    @Override
    public Comment addComment(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Comment addComment(String s, String s1, String s2, String s3) {
        return null;
    }

    @Override
    public Comment getComment(String s) {
        return null;
    }

    @Override
    public void deleteComments(String s, String s1) {

    }

    @Override
    public void deleteComment(String s) {

    }

    @Override
    public List<Comment> getTaskComments(String s) {
        return null;
    }

    @Override
    public List<Comment> getTaskComments(String s, String s1) {
        return null;
    }

    @Override
    public List<Comment> getCommentsByType(String s) {
        return null;
    }

    @Override
    public List<Event> getTaskEvents(String s) {
        return null;
    }

    @Override
    public Event getEvent(String s) {
        return null;
    }

    @Override
    public List<Comment> getProcessInstanceComments(String s) {
        return null;
    }

    @Override
    public List<Comment> getProcessInstanceComments(String s, String s1) {
        return null;
    }

    @Override
    public Attachment createAttachment(String s, String s1, String s2, String s3, String s4, InputStream inputStream) {
        return null;
    }

    @Override
    public Attachment createAttachment(String s, String s1, String s2, String s3, String s4, String s5) {
        return null;
    }

    @Override
    public void saveAttachment(Attachment attachment) {

    }

    @Override
    public Attachment getAttachment(String s) {
        return null;
    }

    @Override
    public InputStream getAttachmentContent(String s) {
        return null;
    }

    @Override
    public List<Attachment> getTaskAttachments(String s) {
        return null;
    }

    @Override
    public List<Attachment> getProcessInstanceAttachments(String s) {
        return null;
    }

    @Override
    public void deleteAttachment(String s) {

    }

    @Override
    public List<Task> getSubTasks(String s) {
        return null;
    }
}
