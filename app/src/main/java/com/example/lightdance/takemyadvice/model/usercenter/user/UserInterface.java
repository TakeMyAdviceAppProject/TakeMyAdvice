package com.example.lightdance.takemyadvice.model.usercenter.user;

import com.example.lightdance.takemyadvice.model.usercenter.user.bean.Userbean;

/**
 * @date 2018/2/2.
 * @author LightDance
 * @description 有关用户信息的方法接口
 */

public interface UserInterface {
    public boolean login(Userbean user);

    public void signup(Userbean user);

    //TODO 若干个类似方法以编辑个人资料

    public boolean updateXX(Userbean user);

    public Userbean getUserInfo(Userbean user);
}
