package test_junit5;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClassParameterizedTestCSVSources {

    @ParameterizedTest
    @CsvSource({"first, 1", "second, 2"})
    public void csvSourceTest(String strString, int iNumber) {
        StringBuilder strBuildOutput = new StringBuilder();
        strBuildOutput.append("First string param: ")
                .append(strString)
                .append("\nSecond int param: ")
                .append(iNumber)
                .append("\n");
        System.out.println(strBuildOutput);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/parameterizedTestCSVFileSource.csv")
    public void csvFileSourceTest(String strString, int iNumber) {
        StringBuilder strBuildOutput = new StringBuilder();
        strBuildOutput.append("First string param: ")
                .append(strString)
                .append("\nSecond int param: ")
                .append(iNumber)
                .append("\n");
        System.out.println(strBuildOutput);
    }
}
