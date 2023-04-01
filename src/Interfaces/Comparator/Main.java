package Interfaces.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String [] arg) {

        //objects to compare with one field
        List<Person> arr = new ArrayList<>();

        Person person1 = new Person("dylan", "rutgers", 27);
        Person person2 = new Person("nick", "drexel", 26);
        Person person3 = new Person("cash", "bates", 26);

        arr.add(person1); arr.add(person2); arr.add(person3);

        //objects to compare with multiple fields
        List<Person> arr2 = new ArrayList<>();

        Person person4 = new Person("cash", "bates", 30);
        Person person5 = new Person("cash", "bates", 28);

        arr2.add(person1); arr2.add(person4); arr2.add(person5); arr2.add(person3);

        //unsorted array
        System.out.println("UNSORTED:");

        for(int i = 0; i < arr.size(); i++) {
            Person current = arr.get(i);
            System.out.println(current.toString());
        }

        //sorted array by name
        Collections.sort(arr, new CompareName());

        System.out.println("\nSORTED BY NAME:");

        for(int i = 0; i < arr.size(); i++) {
            Person current = arr.get(i);
            System.out.println(current.toString());
        }

        //sorted array by age
        Collections.sort(arr, new CompareAge());

        System.out.println("\nSORTED BY AGE:");

        for(int i = 0; i < arr.size(); i++) {
            Person current = arr.get(i);
            System.out.println(current.toString());
        }

        //secondary comparison
        Collections.sort(arr2, new CompareNameThenAge());

        System.out.println("\nSORTED BY NAME THEN AGE:");

        for(Person person : arr2) {
            System.out.println(person.toString());
        }

    }

}
