package Data.DataStructures.Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String [] arg) {

        String s = "hello, world";
        count(s);

    }

    public static void count(String s) {

        Map<Character, Integer> map = new HashMap<>();
        char [] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for(Map.Entry e : map.entrySet()) {

            Character k = (Character) e.getKey();
            int v = (int) e.getValue();

            if (v != 1) {
                System.err.println(k + ": " + v);
            } else {
                System.out.println(k + ": " + v);
            }
        }

    }

}
