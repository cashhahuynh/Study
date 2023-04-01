package Interfaces.Comparator;

import java.util.Comparator;

public class CompareNameThenAge implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        int nameCompare = a.getName().compareTo(b.getName());
        int ageCompare = a.getAge().compareTo(b.getAge());

        return (nameCompare == 0) ? ageCompare : nameCompare;

    }
}
