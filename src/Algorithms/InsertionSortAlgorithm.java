package Algorithms;

import java.util.Arrays;

public class InsertionSortAlgorithm {

    //need temp variable to hold current value; if previous is bigger than current then shift right, else insert. index decrements to start over.

    public static void insertionSort() {
        int [] unsorted = {32, 23, 45, 87, 92, 31, 19};
        System.out.println("Unsorted array in insertion sort: " + Arrays.toString(unsorted));
        for(int i = 1; i < unsorted.length; i++) {
            int current = unsorted[i];
            int index = i;

            while(index > 0 && unsorted[index - 1] > current) {
                //swap
                unsorted[index] = unsorted[index - 1];
                index --;
            }

            unsorted[index] = current;
        }
        System.out.println("Sorted array in insertion sort: " + Arrays.toString(unsorted));
    }

}
