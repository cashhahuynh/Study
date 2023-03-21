package CodingChallenges.Tests;

import CodingChallenges.MorseCode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeTest {

    String result1 = MorseCode.translation("-.-.  .- ... ....  ");
    String result2 = MorseCode.translation(" -.-. --- --- .--.  . .-.");
    String result3 = MorseCode.translation("-.- . ...- .. -.");
    String result4 = MorseCode.translation("... . .-.. . -. .-");

    @Test
    public void morseCodeTest() {

        assertAll("morse code",
                () -> assertEquals("C,A,S,H", result1),
                () -> assertEquals("C,O,O,P,E,R", result2),
                () -> assertEquals("K,E,V,I,N", result3),
                () -> assertEquals("S,E,L,E,N,A", result4)
                );
    }

}
