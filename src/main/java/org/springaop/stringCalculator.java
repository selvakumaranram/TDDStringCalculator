package org.springaop;

public class stringCalculator {
    public static int addStringNumbers(String numbers){
        if(numbers != null && !numbers.isEmpty()) return Integer.parseInt(numbers);
        return 0;
    }
}
