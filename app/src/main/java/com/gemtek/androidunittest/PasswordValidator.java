// Copyright © 2017 Gemtek Technology Co., Ltd.
// All rights reserved.

package com.gemtek.androidunittest;

public class PasswordValidator {
    public boolean verifyPassword(String password) {
        //Suppose this method requires to connect to the network
        return "connect to Internet".equals(password);
    }
}