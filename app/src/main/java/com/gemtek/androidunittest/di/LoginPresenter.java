/*
 * Copyright © 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest.di;

import com.gemtek.androidunittest.PasswordValidator;
import com.gemtek.androidunittest.UserManager;

public class LoginPresenter {
    UserManager mUserManager;
    PasswordValidator mPasswordValidator;

    public LoginPresenter(UserManager userManager, PasswordValidator passwordValidator) {
        mUserManager = userManager;
        mPasswordValidator = passwordValidator;
    }

    public void login(String username, String password) {
        System.out.printf("[Class] LoginPresenter:\tUser: %s, Password: %s\n", username, password);

        if (username == null || username.length() == 0) {
            return;
        }

        if (!mPasswordValidator.verifyPassword(password)) {
            return;
        }

        mUserManager.performLogin(username, password);
    }
}
