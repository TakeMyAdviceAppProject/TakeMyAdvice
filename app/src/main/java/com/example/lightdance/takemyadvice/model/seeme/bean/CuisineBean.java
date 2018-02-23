package com.example.lightdance.takemyadvice.model.seeme.bean;

/**
 * 封装推荐美食的实体类，配图用Image类型还是二进制文件类型还是返回链接在线加载未确定暂定url
 * @author LightDance
 * @date 2018/2/5.
 */

public class CuisineBean {
    private String title;
    private String description;
    private String imgUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
