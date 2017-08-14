/*
 * Copyright©, 2017 Gemtek Technology Co., Ltd.
 * All rights reserved.
 */

package com.gemtek.androidunittest;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class CalculatorTestWithHamcrest {
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
        assertThat(actual, is(equalTo(expected)));
        assertThat(actual, is(expected));
        assertThat(actual, is(not(expected + 1)));
    }

    @Test
    public void MultiplyTwoIntegers() throws Exception {
        //Act
        int expected = 8;
        int actual = mCalculator.multiply(2, 4);
        //Assert
        assertThat(actual, is(equalTo(expected)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroThrowException() {
        //Act
        mCalculator.divide(4, 0);
    }
}
