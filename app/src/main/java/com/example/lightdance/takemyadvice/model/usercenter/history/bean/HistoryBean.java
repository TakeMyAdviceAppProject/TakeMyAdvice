package com.example.lightdance.takemyadvice.model.usercenter.history.bean;


import java.sql.Date;

/**
 * 封装的历史记录实体类
 * @author LightDance
 * @date 2018/2/6.
 */

public class HistoryBean {

    private Date date;

    private String title;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
