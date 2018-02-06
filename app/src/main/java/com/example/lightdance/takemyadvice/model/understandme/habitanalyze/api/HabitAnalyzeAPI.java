package com.example.lightdance.takemyadvice.model.understandme.habitanalyze.api;

import com.example.lightdance.takemyadvice.model.understandme.cuisinerecommend.api.AnalyzedCuisineBean;

import java.util.List;

/**
 * 饮食分析界面的对外接口类
 * @author LightDance
 * @date 2018/2/5.
 */

public interface HabitAnalyzeAPI {
    /**
     * 打算用这个方法通过第三方获取饮食习惯分析图，返回值暂定为图片地址，是否换为二进制图片文件容日后协商
     * @return 图片地址
     */
    String getAnalysisImg(String userId);

    /**
     * 打算用这个方法通过第三方获取饮食习惯分析说明
     * @return 饮食习惯说明
     */
    String getAnalysisExplanation();

    /**
     * 打算用这个方法通过第三方根据获取饮食习惯获取推荐菜谱
     * @return
     */
    List<AnalyzedCuisineBean> getRecommandCuisineList();
}
