package Interfaces.Comparator;

import java.util.Comparator;

//helper class
public class CompareName implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {

        return a.name.compareTo(b.name);

    }

}
