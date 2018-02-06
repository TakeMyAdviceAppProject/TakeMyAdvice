package com.example.lightdance.takemyadvice.model.chatwithme.typing.bean;

/**
 * 文字交流实体类
 * @author LightDance
 * @date 2018/2/5.
 */

public class TypingBean {
    /**
     * {@value AUTO_REPLY_ID} 智能回复的id，当isReply为true时设为该字段
     */
    public static final String AUTO_REPLY_ID = "AUTO_REPLY";

    private String publishTime;
    private boolean isReply;
    private String userId;
    private String content;

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public boolean isReply() {
        return isReply;
    }

    public void setReply(boolean reply) {
        isReply = reply;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
