package com.example.lightdance.takemyadvice.model.usercenter.user.bean;

/**
 * 存放当前登录用户信息的实体类
 * @date 2018/2/2.
 * @author LightDance
 */

public class UserBean {

    /**
     * userLevel： 美食等级，小白美食家啥的
     */
    private String userLevel;
    private String nickName;
    private String userId;
    private String userIconId;
    private String userPwd;
    /**
     * 单个参数的构造方法,用途之一是通过用户id查询用户全信息
     * @param userId 用户id
     */
    public UserBean(String userId) {
        this.userId = userId;
    }

    /**
     * 登录时使用的UserBean
     * @param userId 账号
     * @param userPwd 密码
     */
    public UserBean(String userId , String userPwd){
        this.userId = userId;
        this.userPwd = userPwd;
    }

    /**
     * 用于存储当前登录用户、查询其他用户信息时使用的构造方法
     * @param userLevel 等级
     * @param nickName 昵称
     * @param userId id
     * @param userIconId 头像id
     */
    public UserBean(String userLevel, String nickName, String userId, String userIconId) {
        this.userLevel = userLevel;
        this.nickName = nickName;
        this.userId = userId;
        this.userIconId = userIconId;
    }

    /**
     * 全参数构造方法，注册用
     * @param userLevel 等级
     * @param nickName 昵称
     * @param userId id
     * @param userIconId 头像id
     * @param userPwd 密码
     */
    public UserBean(String userLevel, String nickName, String userId, String userIconId, String userPwd) {
        this.userLevel = userLevel;
        this.nickName = nickName;
        this.userId = userId;
        this.userIconId = userIconId;
        this.userPwd = userPwd;
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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
