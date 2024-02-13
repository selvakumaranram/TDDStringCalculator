package org.springTDDCraftsPerson;

public class AppController {
    public static void main(String s[]) {
        IncubyteStringCalculator incubyteStringCalculator = new IncubyteStringCalculator();
        System.out.println(incubyteStringCalculator.addStringNumbers("1;2,1\n14"));
    }
}
