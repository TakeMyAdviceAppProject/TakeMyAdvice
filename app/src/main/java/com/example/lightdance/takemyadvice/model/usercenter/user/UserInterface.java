package com.example.lightdance.takemyadvice.model.usercenter.user;

import com.example.lightdance.takemyadvice.model.usercenter.user.bean.UserBean;

/**
 * 有关用户信息的方法接口
 * @date 2018/2/2.
 * @author LightDance
 */

public interface UserInterface {
    boolean login(UserBean user);

    void signup(UserBean user);

    //TODO 若干个类似方法以编辑个人资料

    boolean updateXX(UserBean user);

    /**
     * 用只有id的UserBean获取用户信息
     * @param user 封装userid
     * @return 信息完全的UserBean
     */
    UserBean getUserInfo(UserBean user);

    /**
     * 获取当前登录的用户信息，游客身份暂定返回值为null
     * @return 当前登录的用户信息
     */
    UserBean getLogedUserInfo();
}
