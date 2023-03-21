package CodingChallenges;

import java.util.HashMap;
import java.util.Map;

public class ReplacingAlphabet {

    public static String replaceAlphabetPosition(String str) {
        String strLower = str.toLowerCase();
        Map<Integer, String> position = new HashMap<>();
        position.put(1, "a"); position.put(2, "b"); position.put(3, "c"); position.put(4, "d"); position.put(5, "e"); position.put(6, "f");
        position.put(7, "g"); position.put(8, "h"); position.put(9, "i"); position.put(10, "j"); position.put(11, "k"); position.put(12, "l");
        position.put(13, "m"); position.put(14, "n"); position.put(15, "o"); position.put(16, "p"); position.put(17, "q"); position.put(18, "r");
        position.put(19, "s"); position.put(20, "t"); position.put(21, "u"); position.put(22, "v"); position.put(23, "w"); position.put(24, "x");
        position.put(25, "y"); position.put(26, "z");

        String [] test = strLower.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < test.length; i ++) {

            String current = test[i];

            position.forEach((key, value) -> {
                if(value.equals(current)) {
                    sb.append(key + " ");
                }
            });

        }
        //System.out.println(sb.toString());
        return sb.toString().trim();
    }

}
