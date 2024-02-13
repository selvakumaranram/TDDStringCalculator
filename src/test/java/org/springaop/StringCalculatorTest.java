package org.springaop;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void returnZeroIfItisEmptyString()
    {
        assertEquals(0, stringCalculator.addStringNumbers(""));
    }

    @Test
    public void returnSingleNumber() {
        assertEquals(1, stringCalculator.addStringNumbers("1"));
    }

    @Test
    public void returnTwoNumbersWithComma() {
        assertEquals(1, stringCalculator.addStringNumbers("1"));
    }
}
