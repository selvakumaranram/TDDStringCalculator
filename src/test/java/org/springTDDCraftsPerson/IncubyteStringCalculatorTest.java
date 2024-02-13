package org.springTDDCraftsPerson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class IncubyteStringCalculatorTest {

    IncubyteStringCalculator incubyteStringCalculator=new IncubyteStringCalculator();
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

    @Test
    public void testNegativeNumbers() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.addStringNumbers("1,-2,3,-4");
        });
        assertEquals("Negative numbers not allowed: [-2, -4]", exception.getMessage());
    }

    @Test
    public void testCustomDelimiter() {
        assertEquals(3, incubyteStringCalculator.addStringNumbers("//;\n1;2"));
    }
}
