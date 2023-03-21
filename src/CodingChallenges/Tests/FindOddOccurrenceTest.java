package CodingChallenges.Tests;

import CodingChallenges.FindOddOccurrence;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class FindOddOccurrenceTest {

    public static int[] data() {
        return new int[] {1, 1, 2, 3, 3, 4, 4, 5, 5, 5, 5};
    }

    public static int[] data2() {
        return new int[] {1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5};
    }

    public static int[] data3() {
        return new int[] {1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 5};
    }

    @Test
    public void test1() {
        assertAll("testing odd occurrence",
                () -> assertEquals(2, FindOddOccurrence.findOddOccurrence(data())),
                () -> assertEquals(1, FindOddOccurrence.findOddOccurrence(data2())),
                () -> assertEquals(3, FindOddOccurrence.findOddOccurrence(data3()))
                );
    }

}
