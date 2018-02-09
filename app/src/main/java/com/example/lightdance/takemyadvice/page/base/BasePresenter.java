package com.example.lightdance.takemyadvice.page.base;

/**
 * presenter的基类
 * @author  LightDance
 * @date 2018/2/2.
 */

public interface BasePresenter {

    /**
     * 和 View (Fragment) 的生命周期结合
     * TODO 内存溢出问题未解决，描述同{@see BaseView}
     */
    void start();

    void destroy();
}
