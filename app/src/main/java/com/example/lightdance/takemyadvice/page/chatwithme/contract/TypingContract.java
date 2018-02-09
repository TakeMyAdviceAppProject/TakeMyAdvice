package com.example.lightdance.takemyadvice.page.chatwithme.contract;

import com.example.lightdance.takemyadvice.page.base.BasePresenter;
import com.example.lightdance.takemyadvice.page.base.BaseView;
import com.example.lightdance.takemyadvice.page.chatwithme.presenter.TypingPresenter;

/**
 * file description
 *
 * @author LightDance
 * @date 2018/2/9.
 */

public class TypingContract {
    public interface Presenter extends BasePresenter{
        /**
         * 打字聊天.发消息
         */
        void sendMsg();

        /**
         * 打字聊天.收回复
         */
        void getPeply();
    }

    public  interface View extends BaseView<Presenter>{
        /**
         * 点发送时的逻辑
         * @param msg 发送的消息
         */
        void clickSend(String msg);

    }
}
