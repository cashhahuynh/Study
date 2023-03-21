package CodingChallenges.Tests;

import CodingChallenges.IntegerToRomanNumeral;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanNumeralTest {

    String result1 = IntegerToRomanNumeral.intToRomanNumeral(3421);
    String result2 = IntegerToRomanNumeral.intToRomanNumeral(566);
    String result3 = IntegerToRomanNumeral.intToRomanNumeral(45);
    String result4 = IntegerToRomanNumeral.intToRomanNumeral(6);

    @Test
    public void romanNumberalTest() {
        assertAll("roman numberal",
                () -> assertEquals("MMMCDXXI", result1),
                () -> assertEquals("DLXVI", result2),
                () -> assertEquals("XLV", result3),
                () -> assertEquals("VI", result4)
                );
    }

}
