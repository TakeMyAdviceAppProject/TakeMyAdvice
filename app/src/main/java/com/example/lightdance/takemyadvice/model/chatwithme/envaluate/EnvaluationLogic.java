package com.example.lightdance.takemyadvice.model.chatwithme.envaluate;

import java.util.List;

/**
 * 评价功能实现类
 * @author LightDance
 * @date 2018/2/4.
 */

public class EnvaluationLogic implements EnvaluateInterface {
    @Override
    public boolean publishEnvaluation(String envaluation) {
        return false;
    }

    @Override
    public List<String> getEnvaluations() {
        return null;
    }

    @Override
    public boolean delMyEnvaluation(int envaluationId) {
        return false;
    }

    @Override
    public boolean replyEnvaluation(int envaluationId, String envaluation) {
        return false;
    }
}
