package CodingChallenges.Tests;

import CodingChallenges.DigitalRoot;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalRootTest {

    int result1 = DigitalRoot.digitalRoot(56);
    int result2 = DigitalRoot.digitalRoot(675);
    int result3 = DigitalRoot.digitalRoot(43555);
    int result4 = DigitalRoot.digitalRoot(1);

    @Test
    public void digitalRootGroupTest() {
        assertAll("digital root",
                () -> assertEquals(2, result1),
                () -> assertEquals(9, result2),
                () -> assertEquals(4, result3),
                () -> assertEquals(1, result4)
        );
    }

}
