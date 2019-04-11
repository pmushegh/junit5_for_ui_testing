package test_junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestClassParameterizedTestValueSource {

    @ParameterizedTest
    @ValueSource(strings = {"A1", "A2", "A3"})
    public void valueSourceStringTest(String strParams) {
        System.out.printf(strParams);
    }

    @ParameterizedTest
    @ValueSource(doubles = {2.1, 3.4})
    public void valueSourceDoubleTest(double dNumbers) {
        System.out.printf(Double.toString(dNumbers));
    }

}
