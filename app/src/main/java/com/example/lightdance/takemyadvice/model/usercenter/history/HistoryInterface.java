package com.example.lightdance.takemyadvice.model.usercenter.history;

import com.example.lightdance.takemyadvice.model.usercenter.history.bean.HistoryBean;

import java.util.List;

/**
 * 历史记录（足迹）接口类
 * @author LightDance
 * @date 2018/2/5.
 */

public interface HistoryInterface {

    List<HistoryBean> getHistoryById(String userId);


}
