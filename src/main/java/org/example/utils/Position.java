package org.example.utils;

import org.example.model.Constants;
import org.example.model.SiFunction;

public class Position implements SiFunction<Double> {
    @Override
    public Double apply(Double y, Double yi) {
        return y + Constants.EPSILON.get() * yi;
    }
}
