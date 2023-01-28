package Algorithms;

import java.util.Arrays;

public class BubbleSortAlgorithm {

    //compares current element to previous- if previous is bigger, swap until previous is smaller; then will run again with new current value

    public static void bubbleSort() {
        int [] unsorted = {32, 23, 45, 87, 92, 31, 19};
        System.out.println("Unsorted array in bubble sort: " + Arrays.toString(unsorted));

        for(int i = 0; i < unsorted.length; i ++) {
            for(int j = unsorted.length - 1; j > i; j --) {
                if (unsorted[j] < unsorted[j - 1]) {
                    swap(unsorted, j, j-1);
                }
            }
        }

        System.out.println("Sorted array in bubble sort: " + Arrays.toString(unsorted));

    }

    public static void swap(int [] array, int current, int previous) {
        int placeHolder = array[current];
        array[current] = array[previous];
        array[previous] = placeHolder;
    }

}
