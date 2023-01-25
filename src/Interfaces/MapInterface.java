package Interfaces;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

    //HashMap is a collection of key:value pairs
    public static void hashMapTest() {
        Map<Character, Integer> hs = new HashMap<>();
        char [] charArr = {'a', 'c', 'b', 'd', 'a', 'a', 'c'}; //can invoke toCharArray() on string for char []

        for(Character c : charArr) {
            if (hs.containsKey(c)) {
                hs.put(c, hs.get(c) + 1);
            } else {
                hs.put(c, 1);
            }
        }

        System.out.println("Example of HashMap: ");
        for(Map.Entry e : hs.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    //LinkedHashMap is a collection of key:value pairs and it honors order of insertion
    public static void linkedHashMapTest() {
        Map<Character, Integer> lhm = new LinkedHashMap<>();
        char [] charArr = {'a', 'c', 'b', 'd', 'a', 'a', 'c'};

        for (Character c : charArr) {
            if(lhm.containsKey(c)) {
                lhm.put(c, lhm.get(c) + 1);
            } else {
                lhm.put(c, 1);
            }
        }

        System.out.println("Example of LinkedHashMap: ");

        for (Map.Entry e : lhm.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("Example of LinkedHashMap being a tool to identify first unique char: ");

        for (Map.Entry e : lhm.entrySet()) {
            if (e.getValue().equals(1)) {
                System.out.println(e.getKey());
                break;
            }
        }
    }

    //TreeMap is a collection that organizes key by ascending order (works with numbers if Integer is data type)
    public static void treeMapTest() {
        Map<String, Integer> tm = new TreeMap<>();
        tm.put("cashlynn", 26);
        tm.put("cash", 25);
        tm.put("ashlynn", 19);
        tm.put("emily", 17);

        for(Map.Entry e : tm.entrySet()) {
            System.out.println("Name: " + e.getKey() + " - " + "Age: " + e.getValue());
        }
    }

}
