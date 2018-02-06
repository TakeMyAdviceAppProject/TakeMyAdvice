package com.example.lightdance.takemyadvice.model.usercenter.likes;


import java.sql.Date;

/**
 * 封装的点赞详情实体类
 * @author LightDance
 * @date 2018/2/6.
 */

class DetailLikesBean {

    private String likerId;

    private Date operateTime;

    public String getLikerId() {
        return likerId;
    }

    public void setLikerId(String likerId) {
        this.likerId = likerId;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}
