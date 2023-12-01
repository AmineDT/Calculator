package com.amine.calculator;

import junit.framework.*;



public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testSum() {
        assertEquals(8, calculator.sum(3, 5));
    }
}