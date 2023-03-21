package CodingChallenges.Tests;

import CodingChallenges.Pangram;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PangramTest {

    public static String[][] strs() {
        return new String[][] {{"abd", "false"}, {"123", "false"}, {"abcdefghijklmnopqrstuvwxyz", "true"}, {"abcdefghijklmnopqrstuvwyzzz", "true"}};
    }

    boolean result1 = Pangram.isPangram("abd");
    boolean result2 = Pangram.isPangram("123");
    boolean result3 = Pangram.isPangram("abcdefghijklmnopqrstuvwxyz");
    boolean result4 = Pangram.isPangram("abcdefghijklmnopqrstuvwyzzz");

    @Test
    public void pangramTest() {
        assertAll("pangram check",
                () -> assertEquals(false, result1),
                () -> assertEquals(false, result2),
                () -> assertEquals(true, result3),
                () -> assertEquals(false, result4)
                );
    }

}
