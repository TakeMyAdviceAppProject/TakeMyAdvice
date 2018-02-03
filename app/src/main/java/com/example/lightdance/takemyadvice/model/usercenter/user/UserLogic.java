package com.example.lightdance.takemyadvice.model.usercenter.user;

import com.example.lightdance.takemyadvice.model.usercenter.user.bean.Userbean;

/**
 * @author  LightDance
 * @date 2018/2/2.
 * @description 有关用户信息的接口实现类
 */

public class UserLogic implements UserInterface {
    @Override
    public boolean login(Userbean user) {
        return false;
    }

    @Override
    public void signup(Userbean user) {

    }

    @Override
    public boolean updateXX(Userbean user) {
        return false;
    }

    @Override
    public Userbean getUserInfo(Userbean user) {
        return null;
    }
}
