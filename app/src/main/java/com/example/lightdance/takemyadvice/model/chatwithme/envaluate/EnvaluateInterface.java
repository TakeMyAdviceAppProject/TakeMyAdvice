package com.example.lightdance.takemyadvice.model.chatwithme.envaluate;

import java.util.List;

/**
 * 评价功能的接口
 * @author LightDance
 * @date 2018/2/4.
 */

public interface EnvaluateInterface {

    /**
     * 发布评论
     * @param envaluation 具体评论
     * @return true成功，false失败
     */
    boolean publishEnvaluation(String envaluation);

    /**
     * 数据库中查评论
     * @return 评论列表
     */
    List<String> getEnvaluations();

    /**
     * 通过id删除自己的评论
     * @param envaluationId 区别不同评论的评论编号
     * @return true成功，false失败
     */
    boolean delMyEnvaluation(int envaluationId);

    /**
     * 回复他人评论
     * @param envaluationId 评论编号
     * @param envaluation 评论文字
     * @return true成功，false失败
     */
    boolean replyEnvaluation(int envaluationId,String envaluation);
}
