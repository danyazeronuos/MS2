package org.example;

import org.example.model.Constants;
import org.example.utils.Calculator;
import org.example.utils.MyFunction;

public class Main {
    private MyFunction myFunction;


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        var list = calculator.calculate(15);
        list.forEach(System.out::println);
    }
}