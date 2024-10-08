package org.example.utils;

import org.example.model.Constants;
import org.example.model.SiFunction;

import java.util.function.DoubleFunction;

public class Speed implements SiFunction<Double> {
    @Override
    public Double apply(Double yi, Double yii) {
        return yi + Constants.EPSILON.get() * yii;
    }
}
