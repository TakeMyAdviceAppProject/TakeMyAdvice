package com.example.lightdance.takemyadvice.page.base;

/**
 * @author  LightDance
 * @date 2018/2/2.
 * @description 视图的基类，共有方法写在这里面
 */

public interface BaseView<T extends BasePresenter> {

    /**
     * 将指定的presenter与view绑定，由于每个 View 都对应一个 Presenter，
     * 所以把 bindPresenter 写在 BaseView 中减少重复代码
     * TODO 注：绑定后为防止页面被finish掉而未解除绑定的情况出现，要搞一个“弱引用”出来，可惜我不会:(
     * @param presenter
     */
    void bindPresenter(T presenter);

    /**
     * 参数表详见 {@see com.example.lightdance.takemyadvice.app.MessageLevel}
     * @param msg
     * @param level 默认为TOAST
     */
    void showMessage(String msg , int level);
}
