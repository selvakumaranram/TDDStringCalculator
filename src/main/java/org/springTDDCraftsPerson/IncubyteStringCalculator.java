package org.springTDDCraftsPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncubyteStringCalculator {
    public int addStringNumbers(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        // Check for a custom delimiter and split numbers
        String[] numsArray = processCustomDelimiterAndSplitNumbers(numbers);
        return processNumberAndSum(numsArray );
    }

    private int processNumberAndSum(String[] numsArray) {
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();
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

    private String[] processCustomDelimiterAndSplitNumbers(String numbers) {
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf('\n');
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }
        String[] splitNumbers = numbers.split(delimiter + "|\\n");
        return splitNumbers;
    }
}
