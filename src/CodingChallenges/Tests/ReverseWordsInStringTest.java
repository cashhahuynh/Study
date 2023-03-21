package CodingChallenges.Tests;

import CodingChallenges.ReverseWordsInString;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInStringTest {

    String result1 = ReverseWordsInString.reverseWordsInString("Happy New Year, Cashlynn!");
    String result2 = ReverseWordsInString.reverseWordsInString("I'm a miss opportunity.");
    String result3 = ReverseWordsInString.reverseWordsInString("SEE YOU LATER BOY!");
    String result4 = ReverseWordsInString.reverseWordsInString("Do you like cupcakes?");

    @Test
    public void reverseWordsInStringTest() {
        assertAll("reverse words in a string",
                () -> assertEquals("Cashlynn! Year, New Happy", result1),
                () -> assertEquals("opportunity. miss a I'm", result2),
                () -> assertEquals("BOY! LATER YOU SEE", result3),
                () -> assertEquals("cupcakes? like you Do", result4)
                );
    }

}
