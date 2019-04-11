package test_junit5;

import enumsForTesting.TestEnum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class TestClassParameterizedTestEnumSource {

    @ParameterizedTest
    @EnumSource(TestEnum.class)
    public void customEnumSource(TestEnum testEnum) {
        System.out.println(testEnum.toString());
    }

    @ParameterizedTest
    @EnumSource(value = TestEnum.class, names = {"RED", "GREEN"})
    public void customEnumSourceOnlyRedGreen(TestEnum testEnum) {
        System.out.printf(testEnum.toString());
    }

    // The same thing as above one
    @ParameterizedTest
    @EnumSource(value = TestEnum.class, mode = EnumSource.Mode.INCLUDE, names = {"RED", "GREEN"})
    public void customEnumSourceOnlyRedGreenUsingInclude(TestEnum testEnum) {
        System.out.printf(testEnum.toString());
    }

    @ParameterizedTest
    @EnumSource(value = TestEnum.class, mode = EnumSource.Mode.EXCLUDE, names = {"RED"})
    public void customEnumSourceAllExceptRed(TestEnum testEnum) {
        System.out.printf(testEnum.toString());
    }

}
