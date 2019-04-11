package test_junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class TestClassRepeatedTest {


    @RepeatedTest(value = 3, name = "{displayName} -> {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeated test name")
    public void someTest(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

}
