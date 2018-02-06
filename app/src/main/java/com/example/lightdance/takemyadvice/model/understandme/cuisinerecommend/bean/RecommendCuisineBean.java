package com.example.lightdance.takemyadvice.model.understandme.cuisinerecommend.bean;

/**
 * 封装推荐菜谱的实体类
 * @author LightDance
 * @date 2018/2/5.
 */

public class RecommendCuisineBean {
    private String name;
    private String description;
    private String PicId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicId() {
        return PicId;
    }

    public void setPicId(String picId) {
        PicId = picId;
    }
}
