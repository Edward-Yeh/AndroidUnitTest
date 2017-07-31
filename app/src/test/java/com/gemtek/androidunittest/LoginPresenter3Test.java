/*
 * Copyright©, 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.ArgumentMatchers.anyString;

public class LoginPresenter3Test {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    UserManager mMockUserManager;

    @Mock
    PasswordValidator mValidator;

    @Test
    public void verifyPerformLogin() {
        // Arrange
        LoginPresenter3 loginPresenter = new LoginPresenter3(mMockUserManager, mValidator);
        Mockito.when(mValidator.verifyPassword(anyString())).thenReturn(true);
        // Act
        loginPresenter.login("Edward Yeh", "P@ssw0rd");
        // Assert
        Mockito.verify(mMockUserManager).performLogin("Edward Yeh", "P@ssw0rd");
    }
}
