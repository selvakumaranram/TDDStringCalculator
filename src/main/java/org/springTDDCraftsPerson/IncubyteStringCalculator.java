package org.springTDDCraftsPerson;

import java.util.ArrayList;
import java.util.List;

public class IncubyteStringCalculator {
    private static final int MAX_NUMBER = 1000;

    public int addStringNumbers(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        // Check for a custom delimiter and split numbers
        String[] numsArray = processCustomDelimiterAndSplitNumbers(numbers);
        return processNumberAndSum(numsArray);
    }

    private int processNumberAndSum(String[] numsArray) {
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();
        for (String num : numsArray) {
            try {
                int number = Integer.parseInt(num);
                if (number < 0) {
                    negatives.add(number);
                } else if (number > MAX_NUMBER) {
                    continue; // Ignore numbers greater than 1000
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
        String[] splitNumbers = numbers.split("[" + delimiter + "|\n]");
        return splitNumbers;
    }
}
