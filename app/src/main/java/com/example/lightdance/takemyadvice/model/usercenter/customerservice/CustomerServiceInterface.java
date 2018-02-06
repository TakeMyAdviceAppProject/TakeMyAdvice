package com.example.lightdance.takemyadvice.model.usercenter.customerservice;

/**
 * 联系客服功能的接口类，链接方式待考虑
 * @author LightDance
 * @date 2018/2/6.
 */

public interface CustomerServiceInterface {

    /**
     * 联系方式，文字版
     * @return QQ群号 or 微信公众号 or 电话号码
     */
    String getContactWay();

    /**
     * 电话呼叫，实现时需要在Manifest里申请通话功能，并在设置中授权
     */
    void callServiceCenter();
}
