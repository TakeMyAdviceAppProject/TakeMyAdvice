package com.example.lightdance.takemyadvice.model.seeme;

/**
 * 瞅我模块接口类
 * TODO 由于api啥样未知，故未加入listener参数
 * @author LightDance
 * @date 2018/2/5.
 */

interface SeeMeInterface {

    interface ServiceInterface{
        /**
         * 成功得到服务数据
         */
        void onSuccess();

        /**
         * 获取服务失败
         */
        void onFailure();
    }

    /**
     * 调用百度(or其他？)地图获取没事餐厅
     */
    void getCuisineMap();

    /**
     * 调用服务获取美食top榜
     */
    void getTopCuisine();

    /**
     * 调用服务获取推荐餐厅
     */
    void getCommandRestaurant();
}
