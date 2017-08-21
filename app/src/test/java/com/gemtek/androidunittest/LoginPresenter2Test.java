// Copyright © 2017 Gemtek Technology Co., Ltd.
// All rights reserved.

package com.gemtek.androidunittest;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class LoginPresenter2Test {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    UserManager mMockUserManager;

    @Test
    public void verifyPerformLogin() {
        // Arrange
        LoginPresenter2 loginPresenter = new LoginPresenter2(mMockUserManager);
        // Act
        loginPresenter.login("Edward Yeh", "P@ssw0rd");
        // Assert
        Mockito.verify(mMockUserManager).performLogin("Edward Yeh", "P@ssw0rd");
    }
}
