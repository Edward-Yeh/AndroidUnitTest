/*
 * Copyright©, 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

public class LoginPresenter2 {

    private UserManager mUserManager;

    public LoginPresenter2(UserManager userManger) {
        mUserManager = userManger;
    }

    public void login(String username, String password) {
        if (username == null || username.length() == 0) {
            return;
        }

        mUserManager.performLogin(username, password);
    }
}