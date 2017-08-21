/*
 * Copyright © 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

public class UserManager {
    public void performLogin(String username, String password) {
        System.out.printf("[Class] UserManager:\tUser: %s, Password: %s\n", username, password);
    }
}