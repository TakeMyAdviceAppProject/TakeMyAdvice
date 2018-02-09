package com.example.lightdance.takemyadvice.model.chatwithme;

import com.example.lightdance.takemyadvice.model.usercenter.user.bean.UserBean;

/**
 * 撩我接口类
 * @author LightDance
 * @date 2018/2/3
 */

public interface ChatWithMeInterface {
    /**
     * 加载显示用户头像和用户名
     * @return 当前登录对象信息
     */
    UserBean getLogedUserInfo();
}
