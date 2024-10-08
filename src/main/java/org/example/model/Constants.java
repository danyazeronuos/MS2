package org.example.model;

public enum Constants {
    OMEGA(1.0) ,
    B_ONE(0.01),
    B_TWO(3.0),
    Y_ZERO(0.152),
    EPSILON(0.05),
    SIGMA(0.130),
    C_ONE(1.0),
    C_THREE(-1.0);

    private final Double value;

    Constants(Double value) {
        this.value = value;
    }

    public Double get() {
        return value;
    }
}
