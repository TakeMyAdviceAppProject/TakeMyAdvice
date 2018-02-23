package com.example.lightdance.takemyadvice.model.chatwithme.envaluate;

import com.example.lightdance.takemyadvice.model.chatwithme.envaluate.bean.EvaluationBean;

import java.util.List;

/**
 * 评价功能的接口
 * @author LightDance
 * @date 2018/2/4.
 */

public interface EvaluateInterface {
    /**
     * 点击上传评论时的接口
     */
    interface EvaluateListener{
        /**
         * 网络通讯成功
         * @param list 获取的评论，调用上传相关方法时值为null
         */
        void onSuccess(List<EvaluationBean> list);

        /**
         * 网络通讯失败
         */
        void onFailure();
    }

    /**
     * 发布评论
     * @param evaluation 具体评论
     * @param listener 监听器接口，回调使用
     */
    void publishEvaluation(EvaluationBean evaluation, EvaluateListener listener);

    /**
     * 服务器查评论
     * @param listener 监听器接口，回调使用
     */
    void getEvaluations(EvaluateListener listener);

    /**
     * 通过id删除自己的评论
     * @param evaluationId 区别不同评论的评论编号
     * @param listener 监听器接口，回调使用
     */
    void delMyEvaluation(int evaluationId, EvaluateListener listener);

    /**
     * 回复他人评论
     * @param evaluationBean 评论实体类
     * @param listener 监听器接口，回调使用
     */
    void replyEvaluation(EvaluationBean evaluationBean, EvaluateListener listener);
}
