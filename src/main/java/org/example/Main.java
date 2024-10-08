package org.example;

import org.example.model.Constants;
import org.example.utils.MyFunction;

public class Main {
    public static void main(String[] args) {
        var y = Constants.Y_ZERO.get();
        var yi = 0.0;

        System.out.println(MyFunction.apply(y, yi, 0.0));
    }
}