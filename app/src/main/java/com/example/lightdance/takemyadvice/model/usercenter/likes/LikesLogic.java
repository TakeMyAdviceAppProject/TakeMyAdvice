package com.example.lightdance.takemyadvice.model.usercenter.likes;

import java.util.List;

/**
 * 点赞模块的实现类
 * @author LightDance
 * @date 2018/2/6.
 */

public class LikesLogic implements LikesInterface {
    @Override
    public GeneralLikesBean getGeneralLikesSituation(String userId) {
        return null;
    }

    @Override
    public List<DetailLikesBean> getDetailLikesSituationList(String userId) {
        return null;
    }

    @Override
    public boolean likeYou(String operatorId, String targetId) {
        return false;
    }

    @Override
    public boolean likeCancle(String operatorId, String targetId) {
        return false;
    }
}
