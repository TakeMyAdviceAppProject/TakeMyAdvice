package com.example.lightdance.takemyadvice.model.usercenter.user;

import com.example.lightdance.takemyadvice.model.usercenter.user.bean.UserBean;

/**
 * 有关用户信息的方法接口
 *
 * @author LightDance
 * @date 2018/2/2.
 */

public interface UserInterface {

    interface LoginListener {
        /**
         * 登录成功
         */
        void onSuccess(UserBean user);

        /**
         * 登录失败
         */
        void onFailure();
    }

    interface SignUpListener {
        /**
         * 注册成功
         */
        void onSuccess();

        /**
         * 注册失败
         *
         * @param description 失败原因
         */
        void onFailure(String description);
    }

    interface SetUserInfoListener {
        /**
         * 设置成功
         *
         * @param user 更新后的用户信息
         */
        void onSuccess(UserBean user);

        /**
         * 设置失败
         */
        void onFailure();
    }

    interface GetUserInfoListener {
        /**
         * 获取成功
         *
         * @param user 获取到的用户信息
         */
        void onSuccess(UserBean user);

        /**
         * 获取失败
         */
        void onFailure();

    }

    /**
     * 登录
     *
     * @param user     试图登录的用户
     * @param listener 回调监听
     */
    void login(UserBean user, LoginListener listener);

    /**
     * 注册 ，注：在查询用户id是否已存在时用判断json数组长度是否为0实现，需要与后台方面交代一下
     *
     * @param user     填写的新用户信息
     * @param listener 回调监听
     */
    void signUp(UserBean user, SignUpListener listener);

    //TODO 若干个类似方法以编辑个人资料

    /**
     * 编辑用户信息
     *
     * @param user     编辑后的用户信息
     * @param listener 回调监听
     */
    void updateXX(UserBean user, SetUserInfoListener listener);

    /**
     * 用只有id的UserBean获取用户信息并将完整信息返回给监听器
     *
     * @param user     封装userid
     * @param listener 回调监听
     */
    void getUserInfo(UserBean user, GetUserInfoListener listener);

    /**
     * 获取当前登录的用户信息，游客身份暂定返回值为null
     *
     * @param listener 回调监听
     */
    void getLogedUserInfo(GetUserInfoListener listener);
}
