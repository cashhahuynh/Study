package Interfaces.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String [] arg) {

        List<ComparableInterface> list = new ArrayList<>();

        list.add(new ComparableInterface("cash", "bates", 30));
        list.add(new ComparableInterface("dylan", "bates", 27));
        list.add(new ComparableInterface("nick", "drexel", 26));
        list.add(new ComparableInterface("mimi", "ut austin", 10));
        list.add(new ComparableInterface("aileen", "baylor university", 10));

        System.out.println("BEFORE COMPARABLE:");

        for(int i = 0; i < list.size(); i++) {
            ComparableInterface current = list.get(i);
            System.out.println(current.toString());
        }

        Collections.sort(list);

        System.out.println("\nAFTER COMPARABLE:");

        for(int i = 0; i < list.size(); i++) {
            ComparableInterface current = list.get(i);
            System.out.println(current.toString());
        }

    }

}
