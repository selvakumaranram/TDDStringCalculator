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
        String[] numsArray = numbers.split(",");
        for (String num : numsArray) {
            try {
                int number = Integer.parseInt(num);
                sum += number;

            } catch (NumberFormatException ignored) {
                // Ignore non-numeric parts
            }
        }
        return sum;
    }
}
