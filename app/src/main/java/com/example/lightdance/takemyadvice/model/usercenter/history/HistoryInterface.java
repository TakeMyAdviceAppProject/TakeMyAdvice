package com.example.lightdance.takemyadvice.model.usercenter.history;

/**
 * 历史记录（足迹）接口类
 * @author LightDance
 * @date 2018/2/5.
 */

public interface HistoryInterface {
    interface OperateListener{
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
     * 通过用户id获取浏览记录
     * @param userId 用户id
     * @param listener 回调监听
     */
    void getHistoryById(String userId, OperateListener listener);


}
