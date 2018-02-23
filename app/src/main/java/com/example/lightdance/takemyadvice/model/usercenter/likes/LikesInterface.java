package com.example.lightdance.takemyadvice.model.usercenter.likes;

/**
 * 点赞功能的接口类
 * @author LightDance
 * @date 2018/2/6.
 */

public interface LikesInterface {

    interface OnLikeListener{
        /**
         * 点赞or取消点赞功能监听，表示成功
         */
        void onSuccess();

        /**
         *  点赞or取消点赞功能监听，表示失败
         */
        void onFailure();
    }
    interface GeneralLikesListener{

        /**
         * 成功获取点赞情况信息
         * @param generalLikesBean 总体点赞情况
         */
        void onSuccess(GeneralLikesBean generalLikesBean);

        /**
         * 获取失败或为游客身份
         * @param description 原因描述
         */
        void onFailure(String description);
    }

    interface DetailLikesListener{
        /**
         * 成功获取单条的 详细的点赞情况信息
         * @param detailLikesBean 详细点赞信息
         */
        void onSuccess(DetailLikesBean detailLikesBean);

        /**
         * 获取失败或为游客身份
         * @param description 原因描述
         */
        void onFailure(String description);

    }
    /**
     * 查询与该用户相关的被赞总体情况
     * @param userId 用户id，null表示游客，应提示登录
     * @param listener 回调监听
     */
    void getGeneralLikesSituation(String userId , GeneralLikesListener listener);

    /**
     * 查询与该用户相关的被赞详情数据，目前思路是把这个加在上面那个方法里面
     * @param userId 用户id，null表示游客，应提示登录
     * @param listener 回调监听
     */
    void getDetailLikesSituationList(String userId , DetailLikesListener listener);

    /**
     * 点赞操作
     * @param operatorId 操作者id
     * @param targetId 被操作对象id
     */
    void likeYou(String operatorId , String targetId , OnLikeListener listener);

    /**
     * 取消点赞
     * @param operatorId 操作者id
     * @param targetId 被操作对象id
     */
    void likeCancle(String operatorId , String targetId , OnLikeListener listener);
}
















