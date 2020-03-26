package com.nihui.activiti.flowservice;

import com.nihui.activiti.bean.ExtUser;
import com.nihui.activiti.dao.mybatis.MyUserDataManagerMapper;
import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.*;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.identity.Authentication;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname AdapterIdentityServiceImpl
 * @Description TODO
 * @Date 2020/3/26 2:12 PM
 * @Created by nihui
 */
@Service
public class AdapterIdentityServiceImpl implements IdentityService {

    @Autowired
    private MyUserDataManagerMapper myUserDataManagerMapper;

    public ExtUser getUser(String userId){
        return myUserDataManagerMapper.findById(userId);
    }
    @Override
    public User newUser(String userId) {
        UserEntityImpl userEntity = new UserEntityImpl();
        ExtUser extUser = myUserDataManagerMapper.findById(userId);
        userEntity.setFirstName(extUser.getFIRST_());
        userEntity.setEmail(extUser.getEMAIL_());
        return userEntity;
    }


    @Override
    public void saveUser(User user) {

    }

    @Override
    public UserQuery createUserQuery() {

        return null;
    }

    @Override
    public NativeUserQuery createNativeUserQuery() {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public Group newGroup(String groupId) {
        return null;
    }

    @Override
    public GroupQuery createGroupQuery() {
        return null;
    }

    @Override
    public NativeGroupQuery createNativeGroupQuery() {
        return null;
    }

    @Override
    public void saveGroup(Group group) {

    }

    @Override
    public void deleteGroup(String groupId) {

    }

    @Override
    public void createMembership(String userId, String groupId) {

    }

    @Override
    public void deleteMembership(String userId, String groupId) {

    }

    @Override
    public boolean checkPassword(String userId, String password) {

        return false;
    }

    @Override
    public void setAuthenticatedUserId(String authenticatedUserId) {
        Authentication.setAuthenticatedUserId(authenticatedUserId);
    }

    @Override
    public void setUserPicture(String userId, Picture picture) {

    }

    @Override
    public Picture getUserPicture(String userId) {
        return null;
    }

    @Override
    public void setUserInfo(String userId, String key, String value) {

    }

    @Override
    public String getUserInfo(String userId, String key) {
        return null;
    }

    @Override
    public List<String> getUserInfoKeys(String userId) {
        return null;
    }

    @Override
    public void deleteUserInfo(String userId, String key) {

    }
}
