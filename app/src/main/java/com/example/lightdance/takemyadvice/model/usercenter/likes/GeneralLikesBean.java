package com.example.lightdance.takemyadvice.model.usercenter.likes;

import java.util.List;

/**
 * 封装的点赞功能实体类
 * @author LightDance
 * @date 2018/2/6.
 */

public class GeneralLikesBean {
    private long likesNum;

    private List<DetailLikesBean> likesContent;

    public long getLikesNum() {
        return likesNum;
    }

    public void setLikesNum(long likesNum) {
        this.likesNum = likesNum;
    }

    public List<DetailLikesBean> getLikesContent() {
        return likesContent;
    }

    public void setLikesContent(List<DetailLikesBean> likesContent) {
        this.likesContent = likesContent;
    }
}
