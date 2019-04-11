package test_junit5;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.*;
import static org.junit.jupiter.api.condition.OS.*;

public class TestClassConditionalDisabledEnabledTests {

    @Test
    @EnabledOnOs({ LINUX, MAC })
    void onLinuxOrMac() {
        System.out.println("This test runs only on Linux and Mac OS");
    }

    @Test
    @DisabledOnOs(WINDOWS)
    void notOnWindows() {
        System.out.println("This test will not run on Windows");
    }

    @Test
    @EnabledOnJre({ JAVA_9, JAVA_10 })
    void onJava9Or10() {
        System.out.println("Runs only on Java 9 and 10");
    }

    @Test
    @DisabledOnJre(JAVA_9)
    void notOnJava9() {
        System.out.println("Will not run on Java 9");
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    void onlyOn64BitArchitectures() {
        System.out.println("Runs only on 64bit architectures");
    }

    @Test
    @DisabledIfSystemProperty(named = "ci-server", matches = "true")
    void notOnCiServer() {
        System.out.println("Will not run on CI server");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ANDROID_HOME", matches = ".*sdk")
    void onlyIfHaveAndroidHome() {
        System.out.println("Test runs only if ANDROID_HOME is set");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "M2_HOME", matches = ".*")
    void notIfHaveM2Home() {
        System.out.println("Test will not run if M2_HOME is set");
    }

    @Test
    @EnabledIf("2 * 3 == 6")
    void willBeExecuted() {
        System.out.println("Some test runs");
    }

    @Test
    @DisabledIf("Math.random() < 0.314159")
    void mightNotBeExecuted() {
        System.out.println("Some test maybe will be executed");
    }

}
