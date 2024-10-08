package org.example.utils;

import org.example.model.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MyFunctionTest {
    private static final Double epsilon = 0.000001;

    @ParameterizedTest
    @CsvSource({
            "0.0,-0.148488",
            "0.05,-0.141991",
            "0.5,-0.0861629",
            "0.8,-0.0552319",
            "5.0,-0.273148",
            "8.0,-0.0198716"
    })
    public void test_1(double input, double expected) {
        var y = Constants.Y_ZERO.get();
        var yi = 0.0;

        var result = MyFunction.apply(y, yi, input);
        Assertions.assertEquals(expected, result, epsilon);
    }

}