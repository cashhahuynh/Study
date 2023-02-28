package CodingChallenges;

import java.util.HashMap;
import java.util.Map;

public class FindOddOccurrence {

    public static int findOddOccurrence(int [] arr) {
        int answer = 0;
        Map<Integer, Integer> counter = new HashMap<>();

        for (Integer i : arr) {
            if (counter.containsKey(i)) {
                counter.put(i, counter.get(i) + 1);
            } else {
                counter.put(i, 1);
            }
        }

        for(Map.Entry e : counter.entrySet()) {
            int num = Integer.parseInt(String.valueOf((Integer) e.getValue()));
            if (num % 2 == 1) {
                answer = Integer.parseInt(String.valueOf((Integer) e.getKey()));
            }
        }

        return answer;

    }

}
