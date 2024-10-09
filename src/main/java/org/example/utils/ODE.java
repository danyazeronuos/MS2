package org.example.utils;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;

public class ODE implements FirstOrderDifferentialEquations {

    @Override
    public int getDimension() {
        return 2;
    }

    @Override
    public void computeDerivatives(double t, double[] y, double[] result) throws MaxCountExceededException, DimensionMismatchException {
        result[0] = y[1];
        result[1] = Equation.apply(y[0], y[1], t);
    }

}
