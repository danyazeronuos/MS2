package org.example.utils;

import org.example.model.Constants;
import org.example.model.Pair;
import org.example.model.Tuple;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class Calculator {
    private final Step stepFunction = new Step();
    private final Speed speedFunction = new Speed();
    private final Position positionFunction = new Position();

    public List<Tuple> calculate(Integer timeLimit) {
        AtomicReference<Double> y = new AtomicReference<>(Constants.Y_ZERO.get());
        AtomicReference<Double> yi = new AtomicReference<>(0.0);

        return IntStream.range(0, timeLimit)
                .mapToDouble(stepFunction::apply)
                .mapToObj(step -> new Pair(
                        step,
                        MyFunction.apply(y.get(), yi.get(), step)
                ))
                .map(pair -> {
                    var speed = speedFunction.apply(yi.get(), pair.yii());
                    var position = positionFunction.apply(y.get(), yi.get());

                    y.set(position);
                    yi.set(speed);

                    return new Tuple(position, speed, pair.t());
                }).toList();
    }
}
