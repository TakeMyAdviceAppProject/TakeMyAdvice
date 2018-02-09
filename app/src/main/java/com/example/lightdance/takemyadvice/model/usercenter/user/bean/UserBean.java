package com.example.lightdance.takemyadvice.model.usercenter.user.bean;

/**
 * 存放当前登录用户信息的实体类
 * @date 2018/2/2.
 * @author LightDance
 */

public class UserBean {

    /**
     * userlevel： 美食等级，小白美食家啥的
     */
    private String userLevel;
    private String nickName;
    private String userId;
    private String userIconId;

    /**
     * 单个参数的构造方法,用途之一是通过用户id查询用户全信息
     * @param userId 用户id
     */
    public UserBean(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserIconId() {
        return userIconId;
    }

    public void setUserIconId(String userIconId) {
        this.userIconId = userIconId;
    }
}
