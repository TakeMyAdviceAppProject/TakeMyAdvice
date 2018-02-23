package com.example.lightdance.takemyadvice.model.chatwithme;

import com.example.lightdance.takemyadvice.model.usercenter.user.bean.UserBean;

/**
 * 撩我接口类
 * @author LightDance
 * @date 2018/2/3
 */

public interface ChatWithMeInterface {

    interface GetMessageListener {
        /**
         * 成功获取用户信息
         * @param user 用户信息
         */
        void onSuccess(UserBean user);

        /**
         * 获取用户信息失败或为游客身份
         */
        void onFailure();
    }
    /**
     * 加载显示用户头像和用户名
     */
    void getLogedUserInfo(GetMessageListener listener);

}
