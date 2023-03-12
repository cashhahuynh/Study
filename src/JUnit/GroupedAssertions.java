package JUnit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupedAssertions {

    AClass user1 = new AClass("John", "Smith", 25);
    AClass user2 = new AClass("Gloria", "Smith", 24);

    @Test
    public void groupAssertions() {

        assertAll("user first name",
                () -> assertEquals("John", user1.getFirstName()),
                () -> assertEquals("Gloria", user2.getFirstName())
                );

    }

}
