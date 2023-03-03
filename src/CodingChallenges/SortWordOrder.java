package CodingChallenges;

import java.util.HashMap;
import java.util.Map;

public class SortWordOrder {

    public static String sortWordOrder(String words) {

        String [] wordsArr = words.split("\\s");
        String regex = "[\\d]";
        Map<Integer, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < wordsArr.length; i++) {
            String current = wordsArr[i];
            String [] currentArr = current.split("");

            for(int j = 0; j < currentArr.length; j++) {
                if (currentArr[j].matches(regex)) {
                    map.put(Integer.valueOf(currentArr[j]), current);
                }
            }
        }

        for(Map.Entry e : map.entrySet()) {
            sb.append(e.getValue() + " ");
        }

        return sb.toString().trim();

    }

}
