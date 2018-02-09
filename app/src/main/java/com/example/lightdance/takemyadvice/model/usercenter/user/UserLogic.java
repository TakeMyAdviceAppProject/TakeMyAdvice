package com.example.lightdance.takemyadvice.model.usercenter.user;

import com.example.lightdance.takemyadvice.model.usercenter.user.bean.UserBean;

/**
 * 有关用户信息的接口实现类
 * @author  LightDance
 * @date 2018/2/2.
 */

public class UserLogic implements UserInterface {
    @Override
    public boolean login(UserBean user) {
        return false;
    }

    @Override
    public void signup(UserBean user) {

    }

    @Override
    public boolean updateXX(UserBean user) {
        return false;
    }

    @Override
    public UserBean getUserInfo(UserBean user) {
        return null;
    }

    @Override
    public UserBean getLogedUserInfo() {
        return null;
    }
}
