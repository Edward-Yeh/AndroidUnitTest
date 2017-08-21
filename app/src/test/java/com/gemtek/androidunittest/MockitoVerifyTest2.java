/*
 * Copyright © 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MockitoVerifyTest2 {
    @Mock
    private List mMockedList;

    @Test
    public void testVerifyMethod() {
        // Act
        mMockedList.add("one");
        mMockedList.add("two");
        mMockedList.clear();

        // Assert
        Mockito.verify(mMockedList).clear();
        Mockito.verify(mMockedList, Mockito.times(1)).add("one");
        Mockito.verify(mMockedList, Mockito.times(2)).add(Mockito.anyString());
        Mockito.verify(mMockedList, Mockito.never()).add("three");
    }
}
