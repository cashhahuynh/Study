package CodingChallenges.Tests;

import CodingChallenges.WhoLikesIt;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoLikesItTest {

    @Test
    public void whoLikesItTest() {
        assertAll("who likes it test",
                () -> assertEquals("cash likes this", WhoLikesIt.whoLikesIt("cash")),
                () -> assertEquals("cash and chi like this", WhoLikesIt.whoLikesIt("cash chi")),
                () -> assertEquals("cash, chi and raf like this", WhoLikesIt.whoLikesIt("cash chi raf")),
                () -> assertEquals("cash, chi and 3 others like this", WhoLikesIt.whoLikesIt("cash chi raf nick steven"))
                );
    }

}
