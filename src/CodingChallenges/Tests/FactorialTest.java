package CodingChallenges.Tests;

import CodingChallenges.Factorial;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    int result1 = Factorial.recursiveFactorial(8);
    int result2 = Factorial.recursiveFactorial(4);
    int result3 = Factorial.recursiveFactorial(5);
    int result4 = Factorial.recursiveFactorial(3);

    @Test
    public void factorialGroupTest() {

        assertAll("factorial",
                () -> assertEquals(40320, result1),
                () -> assertEquals(24, result2),
                () -> assertEquals(120, result3),
                () -> assertEquals(6, result4)
                );

    }

}
