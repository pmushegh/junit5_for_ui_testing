package test_junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClassNonStaticBeforeAfterAll {

    @BeforeAll
    public void blankBeforeAll() {
        System.out.println("Before all call.");
    }

    @AfterAll
    public void blankAfterAll() {
        System.out.printf("After all call.");
    }

    @Test
    public void blankTest_1() {
        System.out.printf("Blank test 1.");
    }

    @Test
    public void blankTest_2() {
        System.out.printf("Blank test 2.");
    }
}
