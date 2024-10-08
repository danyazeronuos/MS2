package org.example.utils;

import org.example.model.Tuple;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Scale implements BiFunction<Tuple, Integer, Tuple> {
    @Override
    public Tuple apply(Tuple tuple, Integer integer) {
        var y = scale(tuple.y(), integer);
        var yi = scale(tuple.yi(), integer);
        var t = tuple.t() * 100 * 2.5;
        return new Tuple(y, yi, t);
    }

    private static Double scale(Double value, Integer height) {
        var mainScale = value * 1_000;
        double middle = height.doubleValue() / 2;

        if (mainScale < 0) {
            return middle + Math.abs(mainScale);
        }
        return middle - Math.abs(mainScale);
    }
}
