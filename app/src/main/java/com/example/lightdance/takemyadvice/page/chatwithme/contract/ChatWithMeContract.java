package com.example.lightdance.takemyadvice.page.chatwithme.contract;

import com.example.lightdance.takemyadvice.page.base.BasePresenter;
import com.example.lightdance.takemyadvice.page.base.BaseView;

/**
 * 契约类，指定接口方法
 * @author LightDance
 * @date 2018/2/8.
 */

public class ChatWithMeContract {
    public interface Presenter extends BasePresenter{
        /**
         * 点击聊一聊时的逻辑
         */
        void clickTyping();

        /**
         * 点击语音时的逻辑
         */
        void clickTalking();

        /**
         * 点击评论时的逻辑
         */
        void clickEnvaluate();
    }

    public interface View extends BaseView<Presenter> {
        /**
         * 显示用户信息
         */
        void showUserMsg(String iconId , String userName);

        /**
         * 提示正在响应
         */
        void onLoading();


    }
}