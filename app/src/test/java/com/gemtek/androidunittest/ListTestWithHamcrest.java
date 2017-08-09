/*
 * Copyright©, 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.not;

public class ListTestWithHamcrest {
    private List<Integer> mList;

    @Before
    public void setUp() {
        // Arrange
        mList = Arrays.asList(5, 2, 4);
    }

    @Test
    public void notHasSizeOf4() {
        // Assert
        assertThat(mList, not(hasSize(4)));
    }

    @Test
    public void containsNumbersInAnyOrder() {
        // Assert
        assertThat(mList, containsInAnyOrder(2, 4, 5));
    }

    @Test
    public void everyItemGreaterThan1() {
        // Assert
        assertThat(mList, everyItem(greaterThan(1)));
    }
}
