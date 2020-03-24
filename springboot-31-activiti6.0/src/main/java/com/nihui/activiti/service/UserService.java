package com.nihui.activiti.service;

import com.nihui.activiti.entity.UserGroup;
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020/3/23 2:02 PM
 * @Created by nihui
 */
@Service
public class UserService {

    @Resource
    private IdentityService identityService;

    public boolean login(String userName, String password) {
        return identityService.checkPassword(userName, password);
    }

    public Object getAllUser() {
        List<User> userList = identityService.createUserQuery().list();
        return toMyUser(userList);
    }

    public Object getAllGroup() {
        List<Group> groupList = identityService.createGroupQuery().list();
        List<UserGroup> userGroupList = new ArrayList<UserGroup>();
        for (Group group : groupList) {
            UserGroup userGroup = new UserGroup();
            userGroup.setId(group.getId());
            userGroup.setName(group.getName());
            userGroupList.add(userGroup);
        }
        return userGroupList;
    }

    public Object getUserGroup(String groupId) {
        List<User> userList = identityService.createUserQuery().memberOfGroup(groupId).list();
        return toMyUser(userList);
    }

    private List<com.nihui.activiti.entity.User> toMyUser(List<User> userList) {
        List<com.nihui.activiti.entity.User > myUserList = new ArrayList<com.nihui.activiti.entity.User>();
        for (User user : userList) {
            com.nihui.activiti.entity.User myUser = new com.nihui.activiti.entity.User();
            myUser.setUserName(user.getId());
            myUser.setPassword(user.getPassword());
            myUserList.add(myUser);
        }
        return myUserList;
    }

    public Object addUser(com.nihui.activiti.entity.User user) {
        String userId = user.getUserName();
        String groupId = user.getGroupId();
        User actUser = identityService.newUser(userId);
        actUser.setPassword(user.getPassword());
        identityService.saveUser(actUser);
        identityService.createMembership(userId, groupId);
        return true;
    }
}
