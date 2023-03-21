package CodingChallenges.Tests;

import CodingChallenges.SortWordOrder;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortWordOrderTest {

    String result1 = SortWordOrder.sortWordOrder("he3y w2hat's u1p 4dude?");
    String result2 = SortWordOrder.sortWordOrder("no4t m3uch ju2st chi1lling.");
    String result3 = SortWordOrder.sortWordOrder("testing without numbers to order");
    String result4 = SortWordOrder.sortWordOrder("i lov3e m2e s1o mu4ch");

    @Test
    public void sortWordOrderTest() {
        assertAll("sort word order based on number",
                () -> assertEquals("u1p w2hat's he3y 4dude?", result1),
                () -> assertEquals("chi1lling. ju2st m3uch no4t", result2),
                () -> assertEquals("", result3),
                () -> assertEquals("s1o m2e lov3e mu4ch", result4)
                );
    }

}
