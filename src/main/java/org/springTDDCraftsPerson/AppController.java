package org.springTDDCraftsPerson;

public class AppController {
    public static void main (String s[]){
        StringCalculator stringCalculator = new StringCalculator();
        System.out.println(stringCalculator.addStringNumbers("1;2,1\n14"));
    }
}
