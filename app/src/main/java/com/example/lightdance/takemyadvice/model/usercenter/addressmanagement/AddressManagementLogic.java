package com.example.lightdance.takemyadvice.model.usercenter.addressmanagement;

import java.util.List;

/**
 * file description
 *
 * @author LightDance
 * @date 2018/2/6.
 */

public class AddressManagementLogic implements AddressManagmentInterface {
    @Override
    public List<String> getAddressListById(String userId) {
        return null;
    }

    @Override
    public boolean addNewAddress(String address, String userId) {
        return false;
    }

    @Override
    public boolean updateAddress(String addressNo, String newContent, String userId) {
        return false;
    }

    @Override
    public boolean delAnAddress(String addressNo, String userId) {
        return false;
    }
}
