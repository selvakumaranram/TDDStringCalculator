package org.springTDDCraftsPerson;

import java.util.ArrayList;
import java.util.List;

public class stringCalculator {
    public static int addStringNumbers(String numbers) {
        int sum = 0;
        if (numbers.isEmpty()) return 0;

        // Split the string based on the following special characters
        String[] numsArray = numbers.split("[,;/\\n//]");
        List<Integer> negatives = new ArrayList<>();

        // Iterate through numsArray array
        for (String num : numsArray) {
            int number = Integer.parseInt(num);
            try {
                if (number < 0) {
                    negatives.add(number);
                } else {
                    sum += number;
                }
            } catch (NumberFormatException ignored) {
                // Ignore non-numeric parts
            }
        }
        return sum;
    }

    /**
     * Hello world!
     *
     */
    public static class App
    {
        public static void main( String[] args )
        {
            System.out.println( "Hello World!" );
        }
    }
}
