package Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamInterface {

    //similar to map method in JavaScript: each element is a result of manipulation
    public static void fizzBuzzIntStream() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

    //how to mutate every element
    public static void intStreamMap() {
        IntStream mapInput = IntStream.iterate(10, i -> i + 1).limit(10);
        System.out.println("map input stream : "+ Arrays.toString(mapInput.toArray()));

        IntStream mapInput1 = IntStream.iterate(10, i -> i + 1).limit(10);
        IntStream mapOutput = mapInput1.map( i -> i * 2);
        System.out.println("map Output stream : "+Arrays.toString(mapOutput.toArray()));

        IntStream input1 = IntStream.iterate(10, i -> i + 1).limit(10);
        System.out.println("flat map : "+Arrays.toString(input1.flatMap( i -> IntStream.of(i)).toArray()));
    }

    //how to filter numbers divisible by 5 and 7
    public static void intStreamFilter57() {
        IntStream stream = IntStream.range(100, 200);

        System.out.println("numbers divisible by 5 and 7 are : ");
        stream.filter(i -> (i % 5 == 0 && i % 7 == 0)).forEach(System.out::println);
    }

    //how to collect output into array, list, or set
    public static void intStreamToCollection() {
        int[] intArray = IntStream.of(1, 2, 3, 1, 2, 3).toArray();
        System.out.println("int array : "+Arrays.toString(intArray));

        List<Integer> list = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toList());
        System.out.println("IntStream to List : "+list);

        Set<Integer> set = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toSet());
        System.out.println("IntStream to Set : "+set);
    }

}
