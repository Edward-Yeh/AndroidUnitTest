// Copyright © 2017 Gemtek Technology Co., Ltd.
// All rights reserved.

package com.gemtek.androidunittest;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.LinkedList;

public class MockitoStubMethodTest {
    // you can mock concrete classes, not only interfaces
    private LinkedList mMockedList = Mockito.mock(LinkedList.class);

    @Test
    public void testWhenThenReturn() {
        // Arrange
        Mockito.when(mMockedList.get(0)).thenReturn("one");
        // Act
        Object actual = mMockedList.get(0);
        Object another = mMockedList.get(999);
        // Assert
        Assert.assertEquals("one", actual);
        Assert.assertNull(another);
    }
}
