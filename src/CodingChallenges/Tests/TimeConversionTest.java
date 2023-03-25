package CodingChallenges.Tests;

import CodingChallenges.TimeConversion;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConversionTest {

    String time1 = "12:01:45 AM";
    String time2 = "07:29:12 PM";
    String time3 = "01:01:45 AM";
    String time4 = "11:21:09 PM";

    @Test
    public void timeConversionTest() {
        assertAll("12 hour to 24 hour",
                () -> assertEquals("24:01:45", TimeConversion.timeConversion(time1)),
                () -> assertEquals("19:29:12", TimeConversion.timeConversion(time2)),
                () -> assertEquals("1:01:45", TimeConversion.timeConversion(time3)),
                () -> assertEquals("23:21:09", TimeConversion.timeConversion(time4))
                );
    }

}
