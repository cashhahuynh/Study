package Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableInterface {

    public static void iterableTest() {
        List<String> list = new ArrayList<>(Arrays.asList("I", "Love", "You", "You", "Love", "Me"));

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
