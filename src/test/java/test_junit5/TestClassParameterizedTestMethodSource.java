package test_junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TestClassParameterizedTestMethodSource {

    @ParameterizedTest
    @MethodSource("stringStreamProvider")
    public void methodSourceTest(String strArguments) {
        System.out.printf(strArguments);
    }

    @ParameterizedTest
    @MethodSource("stringIntListStreamProvider")
    public void methodMultipleArgumentsSourceTest(String strStrings, int iNumbers, List<String> lsStrStrings) {
        StringBuilder strBuilOutput = new StringBuilder();
        strBuilOutput.append("First string argument: ")
                .append(strStrings)
                .append("\n")
                .append("Second int argument: ")
                .append(iNumbers)
                .append("\n")
                .append("Third list argument size: ")
                .append(lsStrStrings.size())
                .append("\n");
        System.out.println(strBuilOutput);
    }

    @ParameterizedTest
    @MethodSource("stringIteratorProvider")
    public void methodIteratorSourceTest(String strStrings) {
        System.out.println(strStrings);
    }

    static Stream<String> stringStreamProvider() {
        return Stream.of("first", "second");
    }

    static Stream<Arguments> stringIntListStreamProvider() {
        return Stream.of(
                Arguments.of("first", 10, Arrays.asList("a", "b")),
                Arguments.of("second", 20, Arrays.asList("x", "y"))
        );
    }

    static Iterator<String> stringIteratorProvider() {
        List<String> arrStrLsStrings = new ArrayList(2);
        arrStrLsStrings.add("a");
        arrStrLsStrings.add("b");
        return arrStrLsStrings.listIterator();
    }
}
