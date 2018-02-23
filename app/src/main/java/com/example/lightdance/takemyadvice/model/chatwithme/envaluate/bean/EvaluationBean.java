package com.example.lightdance.takemyadvice.model.chatwithme.envaluate.bean;

/**
 * 评论功能的实体类
 * @author LightDance
 * @date 2018/2/4.
 */

public class EvaluationBean {
    private boolean isReply;
    private int evaluationId;
    private String publisherId;
    private String content;

    public EvaluationBean(boolean isReply, int evaluationId, String publisherId, String content) {
        this.isReply = isReply;
        this.evaluationId = evaluationId;
        this.publisherId = publisherId;
        this.content = content;
    }

    public boolean isReply() {
        return isReply;
    }

    public void setReply(boolean reply) {
        isReply = reply;
    }

    public int getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(int evaluationId) {
        this.evaluationId = evaluationId;
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
