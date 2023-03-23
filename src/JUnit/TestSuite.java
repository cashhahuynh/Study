package JUnit;

import CodingChallenges.Tests.DigitalRootTest;
import CodingChallenges.Tests.FactorialTest;
import CodingChallenges.Tests.FibonacciSeqTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DigitalRootTest.class,
        FactorialTest.class,
        FibonacciSeqTest.class
})

public class TestSuite {

    //leave empty. designed as a holder for annotations above.

}
