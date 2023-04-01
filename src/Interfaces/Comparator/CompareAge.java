package Interfaces.Comparator;

import java.util.Comparator;

//helper class
public class CompareAge implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {

        return a.getAge() - b.getAge();

    }

}
