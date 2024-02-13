package org.springTDDCraftsPerson;

import java.util.ArrayList;
import java.util.List;

public class incubyteStringCalculator {
    public static int addStringNumbers(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;
        String[] numsArray = numbers.split("[,\\n]");
        for (String num : numsArray) {
            try {
                int number = Integer.parseInt(num);
                if (number < 0) {
                    negatives.add(number);
                } else {
                        sum += number;
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
