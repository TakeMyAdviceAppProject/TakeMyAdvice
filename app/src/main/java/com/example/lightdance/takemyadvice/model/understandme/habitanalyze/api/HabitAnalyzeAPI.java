package com.example.lightdance.takemyadvice.model.understandme.habitanalyze.api;

/**
 * 饮食分析界面的对外接口类
 * @author LightDance
 * @date 2018/2/5.
 */

public interface HabitAnalyzeAPI {

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
     * 打算用这个方法通过第三方获取饮食习惯分析图，返回值暂定为图片地址，是否换为二进制图片文件容日后协商
     * @param userId 用户id
     * @param listener 回调监听
     */
    void getAnalysisImg(String userId , OperateListener listener);

    /**
     * 打算用这个方法通过第三方获取饮食习惯分析说明
     * @param listener 回调监听
     */
    void getAnalysisExplanation(OperateListener listener);

    /**
     * 打算用这个方法通过第三方根据获取饮食习惯获取推荐菜谱 , 参数待定
     * @param listener 回调监听
     */
    void getRecommandCuisineList(OperateListener listener);
}
