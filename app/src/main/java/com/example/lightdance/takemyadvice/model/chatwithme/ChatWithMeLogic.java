package com.example.lightdance.takemyadvice.model.chatwithme;

import com.example.lightdance.takemyadvice.model.base.LoggedUser;
import com.example.lightdance.takemyadvice.model.usercenter.user.bean.UserBean;

/**
 * 撩我实现类
 * @author LightDance
 * @date 2018/2/3
 */

public class ChatWithMeLogic implements ChatWithMeInterface {
    @Override
    public void getLogedUserInfo(GetMessageListener listener) {
        if (LoggedUser.isLogged){
            listener.onSuccess(LoggedUser.loggedUserBean);
        }else {
            listener.onFailure();
        }
    }
}
