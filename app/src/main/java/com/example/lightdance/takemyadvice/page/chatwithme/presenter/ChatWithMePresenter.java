package com.example.lightdance.takemyadvice.page.chatwithme.presenter;

import com.example.lightdance.takemyadvice.model.chatwithme.ChatWithMeInterface;
import com.example.lightdance.takemyadvice.model.chatwithme.ChatWithMeLogic;
import com.example.lightdance.takemyadvice.model.usercenter.user.bean.UserBean;
import com.example.lightdance.takemyadvice.page.chatwithme.contract.ChatWithMeContract;

/**
 * 撩我功能Presenter类
 * @author LightDance
 * @date 2018/2/8.
 */

public class ChatWithMePresenter implements ChatWithMeContract.Presenter {

    private ChatWithMeInterface chatWithMeLogic = new ChatWithMeLogic();
    private ChatWithMeContract.View view;
    @Override
    public void start() {
        UserBean user = chatWithMeLogic.getLogedUserInfo();
        String userName;
        String userIconId;
        if(user == null){
            userIconId = "tourist icon id";
            userName = "游客";
        }else{
            userName = user.getNickName();
            userIconId  = user.getUserIconId();
        }
        view.showUserMsg(userIconId , userName);
    }

    @Override
    public void destroy() {

    }

    //TODO 以下三个方法未完成，因暂未确定页面跳转逻辑是否加在该处
    @Override
    public void clickTyping() {
    }

    @Override
    public void clickTalking() {

    }

    @Override
    public void clickEnvaluate() {

    }
}
