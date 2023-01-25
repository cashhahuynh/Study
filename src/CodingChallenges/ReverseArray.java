package CodingChallenges;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray() {
        String [] arr = {"Happy", "New", "Year", "Cashlynn!"};

        for (int i = 0; i < arr.length / 2; i++) {
            String placeHolder = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = placeHolder;
        }
        System.out.println(Arrays.toString(arr));
    }

}
