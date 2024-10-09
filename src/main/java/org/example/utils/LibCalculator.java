package org.example.utils;

import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.example.model.Constants;
import org.example.model.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LibCalculator {
    private final Step stepFunction = new Step();

    public List<Tuple> calculate(Integer timeLimit) {
        System.out.println("LibCalculator calculate");
        var ode = new ODE();
        var integrator = new ClassicalRungeKuttaIntegrator(Constants.EPSILON.get());
        List<Tuple> results = new ArrayList<>();
        var list = getStepList(timeLimit);

        double[] y0 = new double[] {Constants.Y_ZERO.get(), 0.0};
        for (double t : list) {
           integrator.integrate(ode, t, y0, t + Constants.EPSILON.get(), y0);
            results.add(new Tuple(y0[1], y0[0], t));

        }

        return results;
    }

    private double[] getStepList(Integer timeLimit) {
        return IntStream.range(0, timeLimit)
                .mapToDouble(stepFunction::apply).toArray();
    }
}
