package com.example.lightdance.takemyadvice.model.chatwithme.talking.bean;

/**
 * 语音交流实体类
 * @author LightDance
 * @date 2018/2/3.
 */

public class TalkingBean {
    private double size;
    /**
     * 音频文件字符流
     */
    private String data;
    private String date;

    public TalkingBean(double size, String data, String date) {
        this.size = size;
        this.data = data;
        this.date = date;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
