/*
 * Copyright©, 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

public class LoginPresenter {

    private UserManager mUserManager = new UserManager();

    public void login(String username, String password) {
        if (username == null || username.length() == 0) return;

        mUserManager.performLogin(username, password);
    }
}