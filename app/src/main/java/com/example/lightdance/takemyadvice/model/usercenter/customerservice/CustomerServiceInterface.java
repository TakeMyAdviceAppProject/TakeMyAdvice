package com.example.lightdance.takemyadvice.model.usercenter.customerservice;

/**
 * 联系客服功能的接口类，链接方式待考虑
 * @author LightDance
 * @date 2018/2/6.
 */

public interface CustomerServiceInterface {


    interface GetContactListener {

        /**
         * 操作成功
         */
        void onSuccess();

        /**
         * 操作失败
         */
        void onFailure();
    }

    interface OnCallListener{

        /**
         * 操作成功
         */
        void onSuccess();

        /**
         * 操作失败
         */
        void onFailure();
    }
    /**
     * 联系方式，文字版，以获取 QQ群号 or 微信公众号 or 电话号码
     */
    void getContactWay(GetContactListener listener);

    /**
     * 电话呼叫，实现时需要在Manifest里申请通话功能，并使用动态权限申请
     */
    void callServiceCenter(OnCallListener listene);
}
