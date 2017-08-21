/*
 * Copyright © 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest.di.module;

import com.gemtek.androidunittest.PasswordValidator;
import com.gemtek.androidunittest.UserManager;
import com.gemtek.androidunittest.di.LoginPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    UserManager provideUserManager() {
        return new UserManager();
    }

    @Provides
    PasswordValidator providePasswordValidator() {
        return new PasswordValidator();
    }

    @Provides
    LoginPresenter provideLoginPresenter(
            UserManager userManager,
            PasswordValidator passwordValidator) {
        return new LoginPresenter(userManager, passwordValidator);
    }
}
