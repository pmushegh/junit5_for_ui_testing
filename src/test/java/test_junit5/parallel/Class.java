package test_junit5.parallel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class Class {

    @Test
    public void someTest0() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Test
    public void someTest1() throws InterruptedException {
        Thread.sleep(5000);
    }

}
