package org.springTDDCraftsPerson;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringCalculatorTest {
    @Test
    public void returnZeroIfItisEmptyString() {
        assertEquals(0, StringCalculator.addStringNumbers(""));
    }

    @Test
    public void returnSingleNumber() {
        assertEquals(1, StringCalculator.addStringNumbers("1"));
    }

    @Test
    public void returnTwoNumbersWithComma() {
        assertEquals(60, StringCalculator.addStringNumbers("15,20,25"));
    }

    @Test
    public void testNewLinesBetweenNumbers() {
        assertEquals(6, StringCalculator.addStringNumbers("1\n2,3"));
    }

    @Test
    public void testSemicolon() {
        assertEquals(10, StringCalculator.addStringNumbers("1;5;4"));
    }

    @Test
    public void testCustomCheck() {
        assertEquals(18, StringCalculator.addStringNumbers("//;\n1;\n\n2\n15"));
    }

    @Test
    public void testNegativeNumbers() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.addStringNumbers("1,-2,3,-4");
        });
        assertEquals("Negative numbers not allowed: [-2, -4]", exception.getMessage());
    }

    @Test
    public void returnZeroIfItisMoreThanThousand() {
        assertEquals(501, StringCalculator.addStringNumbers("1;500\n2500"));
    }

}
