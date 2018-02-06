package com.example.lightdance.takemyadvice.model.usercenter.likes;

import java.util.List;

/**
 * 点赞功能的接口类
 * @author LightDance
 * @date 2018/2/6.
 */

public interface LikesInterface {

    /**
     * 查询与该用户相关的被赞总体情况
     * @param userId 用户id，null表示游客，应提示登录
     * @return 被点赞情况封装实体类
     */
    GeneralLikesBean getGeneralLikesSituation(String userId);

    /**
     * 查询与该用户相关的被赞详情数据，目前思路是把这个加在上面那个方法里面
     * @param userId 用户id，null表示游客，应提示登录
     * @return 点赞详情列表
     */
    List<DetailLikesBean> getDetailLikesSituationList(String userId);

    /**
     * 点赞操作
     * @return true 成功，false 失败
     * @param operatorId 操作者id
     * @param targetId 被操作对象id
     */
    boolean likeYou(String operatorId , String targetId);

    /**
     * 取消点赞
     * @return true 成功，false 失败
     * @param operatorId 操作者id
     * @param targetId 被操作对象id
     */
    boolean likeCancle(String operatorId , String targetId);
}
















