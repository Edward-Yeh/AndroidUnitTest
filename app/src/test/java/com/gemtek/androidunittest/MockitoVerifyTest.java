/**
 * Copyright©, 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockitoVerifyTest {
    private List mMockedList = Mockito.mock(List.class);

    @Test
    public void testList() {
        // using mock object - it does not throw any "unexpected interaction" exception
        mMockedList.add("one");
        mMockedList.add("two");
        mMockedList.clear();

        // selective, explicit, highly readable verification
        Mockito.verify(mMockedList).clear();
        Mockito.verify(mMockedList, Mockito.times(1)).add("one");
        Mockito.verify(mMockedList, Mockito.times(2)).add(Mockito.anyString());
        Mockito.verify(mMockedList, Mockito.never()).add("three");
    }
}
