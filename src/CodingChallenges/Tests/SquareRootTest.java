package CodingChallenges.Tests;

import CodingChallenges.SquareRoot;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class SquareRootTest {

    @Test
    public void squareRootTest() {

        String input = "16";

        InputStream in = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);

        String expect = SquareRoot.returnSquareRoot(Integer.parseInt(input));
        String answer = SquareRoot.squareRoot();

        assertEquals(expect, answer);

    }

}
