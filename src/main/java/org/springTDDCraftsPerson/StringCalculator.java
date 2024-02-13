package org.springTDDCraftsPerson;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    private static final int MAX_NUMBER = 1000;
    public static int addStringNumbers(String numbers) {
        int sum = 0;
        // Split the string based on the following special characters
        String[] numsArray = numbers.split("[,;/\\n//]");
        List<Integer> negatives = new ArrayList<>();

        // Iterate through numsArray array
        for (String num : numsArray) {
            try {
                int number = Integer.parseInt(num);
                if (number < 0) {
                    negatives.add(number);
                } else {
                    if (number < MAX_NUMBER) {
                        sum += number;
                    }
                }
            } catch (NumberFormatException ignored) {
                // Ignore non-numeric parts
            }
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives.toString());
        }
        return sum;
    }

}

