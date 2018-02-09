package com.example.lightdance.takemyadvice.page.base;

import android.support.v7.app.AppCompatActivity;

/**
 * 异步获取网络数据时，用户点击了返回键，此时的Activity就执行了onDestroy方法，
 * 但是在Presenter中仍然持有VIew的引用，造成不能及时的回收，从而引起内存溢出
 * 因此引用View时使用弱引用解决该问题
 * @author LightDance
 * @date 2018/2/7.
 */

public abstract class BaseActivity<T extends BasePresenter , V extends BaseView<T>> extends AppCompatActivity {

}
