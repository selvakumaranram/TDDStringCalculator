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
        assertEquals(60, stringCalculator.addStringNumbers("15,20,25"));
    }

    @Test
    public void testNewLinesBetweenNumbers() {
        assertEquals(6, stringCalculator.addStringNumbers("1\n2,3"));
    }

    @Test
    public void testSemicolon() {
        assertEquals(10, stringCalculator.addStringNumbers("1;5;4"));
    }


}
