package test_junit5;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class TestClassExecutionOrder {

    @Test
    @Order(1)
    void first() {
        System.out.println("First executed test");
    }

    @Test
    @Order(2)
    void second() {
        System.out.println("Second executed test");
    }

}
