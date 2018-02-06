package com.example.lightdance.takemyadvice.model.usercenter.addressmanagement;

import java.util.List;

/**
 * 地址管理接口类
 * @author LightDance
 * @date 2018/2/6.
 */

public interface AddressManagmentInterface {

    /**
     * 获取已设置地址
     * @param userId 操作者
     * @return null/ .size()=0表示没有已设置地址，presenter出应有对应逻辑
     */
    List<String> getAddressListById(String userId);

    /**
     * 新增地址
     * @param address 地址
     * @param userId 操作者
     * @return true成功，false失败
     */
    boolean addNewAddress(String address , String userId);

    /**
     * 改
     * @param addressNo 用于区别不同地址以确定改的是哪条
     * @param newContent 新地址内容
     * @param userId 操作者
     * @return true成功，false失败
     */
    boolean updateAddress(String addressNo , String newContent , String userId);

    /**
     * 删
     * @param addressNo 用于区别不同地址以确定改的是哪条
     * @param userId 操作者
     * @return true成功，false失败
     */
    boolean delAnAddress(String addressNo , String userId);
}
