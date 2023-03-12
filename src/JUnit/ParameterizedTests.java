package JUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;

public class ParameterizedTests {

    public static int[][] data() {
        return new int[][] {{1, 2, 2}, {5, 3, 15}, {121, 4, 484}};
    }

    @ParameterizedTest
    @MethodSource(value = "data")
    void testWithMethodSource(int[] data) {
        TestClass test = new TestClass();
        int m1 = data[0];
        int m2 = data[1];
        int expected = data[2];
        assertEquals(expected, test.multiply(m1, m2));
    }

    //good for looping through each element, does not treat data as an array
    @ParameterizedTest
    @ValueSource(ints = {5, 3, 15})
    void testWithValueSource(int data) {
        assertEquals(true, data % 3 == 0 || data % 5 == 0);
    }

    class TestClass {
        public int multiply(int i, int j) {
            return i * j;
        }
    }

}
