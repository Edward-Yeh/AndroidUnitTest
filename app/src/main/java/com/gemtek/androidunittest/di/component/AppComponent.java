/*
 * Copyright © 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest.di.component;

import com.gemtek.androidunittest.di.LoginApplication;
import com.gemtek.androidunittest.di.module.AppModule;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(LoginApplication loginApplication);
}