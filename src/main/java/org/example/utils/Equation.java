package org.example.utils;

import org.example.model.Constants;


public class Equation {

    public static Double apply(Double y, Double yi, Double t) {
        double sin = Math.sin(Constants.OMEGA.get() * t);

        double firstPart = Constants.SIGMA.get() * sin;
        double secondPart = Constants.B_ONE.get() * yi;
        double thirdPart = Constants.B_TWO.get() * Math.abs(yi) * yi;
        double fourthPart = Constants.C_ONE.get() * y;
        double fifthPart = Constants.C_THREE.get() * (y * y * y);

        return firstPart - secondPart - thirdPart - fourthPart - fifthPart;
    }

}
