package CodingChallenges.Tests;

import CodingChallenges.SortOddNum;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortOddNumTest {

    String result1 = Arrays.toString(SortOddNum.sortOddNum(new int [] {9, 10, 5, 6, 7, 23, 1}));
    String result2 = Arrays.toString(SortOddNum.sortOddNum(new int [] {2, 4, 3, 1, 56, 87, 101}));
    String result3 = Arrays.toString(SortOddNum.sortOddNum(new int [] {9, 0, 2, 33, 4, 7, 11}));
    String result4 = Arrays.toString(SortOddNum.sortOddNum(new int [] {7, 6, 5, 4, 3, 2, 1}));

    @Test
    public void sortOddNumTest() {
        assertAll("sort odd numbers",
                () -> assertEquals("[1, 10, 5, 6, 7, 9, 23]", result1),
                () -> assertEquals("[2, 4, 1, 3, 56, 87, 101]", result2),
                () -> assertEquals("[7, 0, 2, 9, 4, 11, 33]", result3),
                () -> assertEquals("[1, 6, 3, 4, 5, 2, 7]", result4)
                );
    }

}
