package JUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArgumentConversion {

    @ParameterizedTest
    @ValueSource(ints = {1, 12, 42})
    void testWithExplicityArgumentConversation(@ConvertWith(ToOctalStringArgumentConverter.class) String argument) {
        System.out.println(argument);
        assertNotNull(argument);
    }

    static class ToOctalStringArgumentConverter extends SimpleArgumentConverter {

        @Override
        protected Object convert(Object source, Class<?> targetType) {
            assertEquals(Integer.class, source.getClass(), "Can only convert from Integers.");
            assertEquals(String.class, targetType, "Can only convert to String.");
            return Integer.toOctalString((Integer) source);
        }
    }
}
