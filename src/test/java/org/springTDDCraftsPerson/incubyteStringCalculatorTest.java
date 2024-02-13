package org.springTDDCraftsPerson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class incubyteStringCalculatorTest {
    @Test
    public void returnZeroIfItisEmptyString()
    {
        assertEquals(0, incubyteStringCalculator.addStringNumbers(""));
    }

    @Test
    public void returnSingleNumber() {
        assertEquals(1, incubyteStringCalculator.addStringNumbers("1"));
    }

    @Test
    public void returnTwoNumbersWithComma() {
        assertEquals(6, incubyteStringCalculator.addStringNumbers("1,5"));
    }
}
