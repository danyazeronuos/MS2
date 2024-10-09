package org.example.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AppTest {
    private static final Double epsilon = 0.000001;

    @ParameterizedTest
    @CsvSource({
            "0.152,0.0,0.0,-0.148488",
            "0.152,0.0,0.05,-0.141991",
            "0.152,0.0,0.5,-0.0861629",
            "0.152,0.0,0.8,-0.0552319",
            "0.152,0.0,5.0,-0.273148",
            "0.152,0.0,8.0,-0.0198716"
    })
    public void test_Function(double y, double yi, double step, double expected) {
        var result = Equation.apply(y, yi, step);
        Assertions.assertEquals(expected, result, epsilon);
    }
}