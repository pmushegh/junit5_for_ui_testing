package test_junit5.parallel;

import org.junit.jupiter.api.Test;

public class Pack1 {

    @Test
    public void someTest() throws InterruptedException {
        Thread.sleep(5000);
    }

}
