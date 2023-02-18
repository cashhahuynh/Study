package CodingChallenges;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static boolean isPangram(String sentence) {

        String sentenceLower = sentence.toLowerCase();
        Set<String> alphabet = new HashSet<>();
        String [] arr = sentenceLower.split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches("[a-z]")) {
                alphabet.add(arr[i]);
            }
        }
        System.out.println(alphabet);
        return alphabet.size() == 26;
    }

    //initially created second function to check for numbers. ditched to use regex. keeping for NumberFormatException handler
    public static boolean isNum(String str) {
        boolean result;
        try {
            Integer num = Integer.parseInt(str);
            result = true;
        } catch (NumberFormatException numberFormatException) {
            result = false;
        }
        return result;
    }

}
