package com.example.lightdance.takemyadvice.model.chatwithme.typing;

import com.example.lightdance.takemyadvice.model.chatwithme.typing.bean.TypingBean;

/**
 * 文字交流的接口类
 * @author LightDance
 * @date 2018/2/5.
 */

public interface TypingInterface {

    interface TypingListener{
        //TODO 待加入代码
    }
    /**
     * 传入文字内容，封装成TypingBean，然后发送到服务器获取响应
     * @param content 聊天内容
     */
    void sendMsg(String content , TypingListener listener);

    /**
     * 暂时打算作为内部方法，在sendMsg成功后调用
     */
    void getReply(TypingBean replyContent , TypingListener listener);
}
