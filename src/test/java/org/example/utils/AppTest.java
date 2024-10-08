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
        var result = MyFunction.apply(y, yi, step);
        Assertions.assertEquals(expected, result, epsilon);
    }

    @ParameterizedTest
    @CsvSource({
            "0.0,-0.148488192,-0.0074244",
            "-0.007424,-0.141751,-0.01451195",
            "-0.01451194,-0.134387,-0.0212313"
    })
    public void test_Speed(double yi, double yii, double excepted) {
        var function = new Speed();
        var result = function.apply(yi, yii);
        Assertions.assertEquals(excepted, result, epsilon);

    }

    @ParameterizedTest
    @CsvSource({
            "0.152,0.0,0.152",
            "0.152,-0.007424,0.1516288",
            "0.151629,-0.014512,0.1509034"
    })
    public void test_Position(double y, double yi, double excepted) {

        var function = new Position();
        var result = function.apply(y, yi);
        Assertions.assertEquals(excepted, result, epsilon);
    }

}