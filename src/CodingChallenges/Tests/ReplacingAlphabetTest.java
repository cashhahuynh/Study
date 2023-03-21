package CodingChallenges.Tests;

import CodingChallenges.ReplacingAlphabet;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplacingAlphabetTest {

    String result1 = ReplacingAlphabet.replaceAlphabetPosition("Cashlynn");
    String result2 = ReplacingAlphabet.replaceAlphabetPosition("I'M VALUABLE");
    String result3 = ReplacingAlphabet.replaceAlphabetPosition("I'm an opportunity");
    String result4 = ReplacingAlphabet.replaceAlphabetPosition("i am deserved");

    @Test
    public void replacingAlphabetTest() {
        assertAll("replacing alphabet with position",
                () -> assertEquals("3 1 19 8 12 25 14 14", result1),
                () -> assertEquals("9 13 22 1 12 21 1 2 12 5", result2),
                () -> assertEquals("9 13 1 14 15 16 16 15 18 20 21 14 9 20 25", result3),
                () -> assertEquals("9 1 13 4 5 19 5 18 22 5 4", result4)
                );
    }

}
