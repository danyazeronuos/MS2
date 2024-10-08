package org.example.utils;

import org.example.model.Constants;

import java.util.function.DoubleFunction;

public class Step implements DoubleFunction<Double> {
    @Override
    public Double apply(double value) {
        return value * Constants.EPSILON.get();
    }
}
