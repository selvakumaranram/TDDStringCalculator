package org.springTDDCraftsPerson;

public class stringCalculator {
    public static int addStringNumbers(String numbers) {
        int sum = 0;
        if (numbers.isEmpty()) return 0;
        String[] numsArray = numbers.split("[,;/\\n//]");
        for (String num : numsArray) {
            try {
                sum += Integer.parseInt(num);
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
