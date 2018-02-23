package com.example.lightdance.takemyadvice.model.usercenter.addressmanagement;

import java.util.List;

/**
 * 地址管理接口类
 * @author LightDance
 * @date 2018/2/6.
 */

public interface AddressManagmentInterface {

    interface ShowAddressListener{
        /**
         * 获取已有地址成功
         */
        void onSuccess(List<String> addressList);

        /**
         * 操作失败
         */
        void onFailure();
    }
    interface EditAddressListener{
        /**
         * 对地址进行删、改时用，表示操作成功
         */
        void onSuccess(List<String> addressList);

        /**
         * 操作失败
         */
        void onFailure();
    }
    /**
     * 判定是否已登录，然后获取已设置地址，并封装成List<String>型  size()=0表示没有已设置地址，presenter出应有对应逻辑
     * @param userId 操作者
     * @param listener 回调监听
     */
    void getAddressListById(String userId , ShowAddressListener listener);

    /**
     * 判定是否已登录后新增地址
     * @param address 地址
     * @param userId 操作者
     * @param listener 回调监听
     */
    void addNewAddress(String address , String userId ,EditAddressListener listener);

    /**
     * 改
     * @param addressNo 用于区别不同地址以确定改的是哪条
     * @param newContent 新地址内容
     * @param userId 操作者
     * @param listener 回调监听
     */
    void updateAddress(String addressNo , String newContent , String userId , EditAddressListener listener);

    /**
     * 删
     * @param addressNo 用于区别不同地址以确定改的是哪条
     * @param userId 操作者
     * @param listener 回调监听
     */
    void delAnAddress(String addressNo , String userId, EditAddressListener listener);
}
