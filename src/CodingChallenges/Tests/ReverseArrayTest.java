package CodingChallenges.Tests;

import CodingChallenges.ReverseArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseArrayTest {

    Object result = ReverseArray.reverseArray();

    @Test
    public void reverseArrayTest() {
        assertEquals("[Cashlynn!, Year, New, Happy]", result);
    }

}
