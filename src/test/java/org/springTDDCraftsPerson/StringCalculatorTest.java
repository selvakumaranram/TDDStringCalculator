package org.springTDDCraftsPerson;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
    @Test
    public void testCustomCheck() {
        assertEquals(18, stringCalculator.addStringNumbers("//;\n1;\n\n2\n15"));
    }

    @Test
    public void testNegativeNumbers() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            stringCalculator.addStringNumbers("1,-2,3,-4");
        });
        assertEquals("Negative numbers not allowed: [-2, -4]", exception.getMessage());
    }

}
