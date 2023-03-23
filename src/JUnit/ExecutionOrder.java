package JUnit;

import CodingChallenges.Factorial;
import CodingChallenges.FindOddOccurrence;
import CodingChallenges.ReverseArray;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExecutionOrder {

    @Test
    //@Order(3)
    public void factorialTest() {
        int result = Factorial.recursiveFactorial(4);
        assertEquals(24, result - 1);
    }

    @Test
    //@Order(2)
    public void reverseArrayTest() {
        assertEquals("[Cashlynn!, Year, New, Happy]", ReverseArray.reverseArray());
    }

    @Test
    //@Order(1)
    public void findOddOccurrenceTest() {
        int [] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5, 5, 5};
        int result = FindOddOccurrence.findOddOccurrence(arr);
        assertEquals(2, result);
    }

}
