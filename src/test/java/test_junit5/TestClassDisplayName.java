package test_junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClassDisplayName {

    @Test
    @DisplayName("Sample display name")
    public void displayNameCheck() {
        System.out.println("This is usage of @DisplayName annotation.");
    }

}
