package JUnit;

import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTest {

    @TestFactory
    Stream<Object> testDifferentMultiplyOperations() {
        TestClass test = new TestClass();
        int[][] data = new int[][] {{1, 2, 2}, {5, 3, 15}, {121, 4, 484}};
        return Arrays.stream(data).map(entry -> {
            int m1 = entry[0];
            int m2 = entry[1];
            int expected = entry[2];
            return dynamicTest(m1 + " * " + m2 + " = " + expected, () -> {
                assertEquals(expected, test.multiply(m1, m2));
            });
        });

    }

    class TestClass {
        public int multiply(int i, int j) {
            return i * j;
        }
    }

}
