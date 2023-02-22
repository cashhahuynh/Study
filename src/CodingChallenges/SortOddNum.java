package CodingChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOddNum {

    public static int [] sortOddNum(int [] arr) {

        List<Integer> oddContainer = new ArrayList<>();

        //storing odd elements in oddContainer
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 != 0) {
                oddContainer.add(arr[i]);
            }
        }

        //sorting oddContainer
        Collections.sort(oddContainer);
        int l = 0;

        //placing sorted oddContainer in arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = oddContainer.get(l++);
            }
        }

        return arr;
    }

}
