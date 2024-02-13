package org.springaop;

public class stringCalculator {
    public static int addStringNumbers(String numbers) {
        int sum = 0;
        if (numbers.isEmpty()) return 0;
        String[] numsArray = numbers.split("[,;/\\n//]");
        for (String num : numsArray) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
