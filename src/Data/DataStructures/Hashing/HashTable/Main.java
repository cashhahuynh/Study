package Data.DataStructures.Hashing.HashTable;

import java.util.Hashtable;

public class Main {

    public static void main(String [] arg) {

        //hashtable does not implement map interface. is a legacy class before introduction of collection framework
        Hashtable<Integer, String> h = new Hashtable<>();
        Hashtable<Integer, String> h1 = new Hashtable<>();

        h.put(3, "Hello");
        h.put(2, "World");
        h.put(1, "!");

        h1 = (Hashtable<Integer, String>) h.clone();

        System.out.println("Values in clone: " + h1);

        h.clear();

        System.out.println("After clearing original hashtable: " + h);

    }

}
