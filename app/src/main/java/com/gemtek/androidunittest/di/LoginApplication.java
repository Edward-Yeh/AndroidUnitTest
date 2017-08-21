/*
 * Copyright © 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest.di;

import com.gemtek.androidunittest.di.component.AppComponent;
import com.gemtek.androidunittest.di.component.DaggerAppComponent;

import javax.inject.Inject;

public class LoginApplication {
    @Inject
    LoginPresenter mLoginPresenter;

    public LoginApplication() {
        AppComponent appComponent = DaggerAppComponent.builder().build();
        appComponent.inject(this);
    }

    public void login() {
        mLoginPresenter.login("Edward", "connect to Internet");
    }

    public static void main(String[] args) {
        new LoginApplication().login();
        System.out.println("Finish...");
    }
}
