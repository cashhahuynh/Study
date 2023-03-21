package CodingChallenges.Tests;

import CodingChallenges.FibonacciSequence;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciSeqTest {

    int result1 = FibonacciSequence.fibonacciSequence(10);
    int result2 = FibonacciSequence.fibonacciSequence(4);
    int result3 = FibonacciSequence.fibonacciSequence(21);
    int result4 = FibonacciSequence.fibonacciSequence(8);

    @Test
    public void fibonacciGroupTest() {
        assertAll("fibonacci test",
                () -> assertEquals(55, result1),
                () -> assertEquals(3, result2),
                () -> assertEquals(10946, result3),
                () -> assertEquals(21, result4)
                );
    }

}
