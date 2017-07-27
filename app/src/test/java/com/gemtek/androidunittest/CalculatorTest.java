/**
 * Copyright©, 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

import junit.framework.Assert;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void sumOfTwoIntegers() throws Exception {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int sum = calculator.add(1, 2);
        // Assert
        Assert.assertEquals(3, sum);
    }
}
