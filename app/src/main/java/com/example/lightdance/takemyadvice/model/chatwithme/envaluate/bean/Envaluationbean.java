package com.example.lightdance.takemyadvice.model.chatwithme.envaluate.bean;

/**
 * 评论功能的实体类
 * @author LightDance
 * @date 2018/2/4.
 */

public class Envaluationbean {
    private boolean isReply;
    private int envaluationId;
    private String publisherId;
    private String content;

    public boolean isReply() {
        return isReply;
    }

    public void setReply(boolean reply) {
        isReply = reply;
    }

    public int getEnvaluationId() {
        return envaluationId;
    }

    public void setEnvaluationId(int envaluationId) {
        this.envaluationId = envaluationId;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
