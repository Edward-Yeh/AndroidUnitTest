/*
 * Copyright©, 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

public class LoginPresenter3 {

    private UserManager mUserManager;
    private PasswordValidator mPasswordValidator;

    public LoginPresenter3(UserManager userManager, PasswordValidator passwordValidator) {
        mUserManager = userManager;
        mPasswordValidator = passwordValidator;
    }

    public void login(String username, String password) {
        if (username == null || username.length() == 0) {
            return;
        }

        if (!mPasswordValidator.verifyPassword(password)) {
            return;
        }

        mUserManager.performLogin(username, password);
    }
}