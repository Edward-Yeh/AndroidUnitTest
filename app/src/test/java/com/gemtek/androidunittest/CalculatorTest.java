/**
 * Copyright©, 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator mCalculator;

    @Before
    public void setup() {
        //Arrange
        mCalculator = new Calculator();
    }

    @Test
    public void addTwoIntegers() throws Exception {
        //Act
        int expected = 3;
        int actual = mCalculator.add(1, 2);
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MultiplyTwoIntegers() throws Exception {
        //Act
        int expected = 8;
        int actual = mCalculator.multiply(2, 4);
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroThrowException() {
        //Act
        mCalculator.divide(4, 0);
    }
}
