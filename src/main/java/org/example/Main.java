package org.example;

import org.example.model.Constants;
import org.example.model.Tuple;
import org.example.utils.Calculator;
import org.example.utils.Drawer;
import org.example.utils.MyFunction;
import org.example.utils.Scale;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private MyFunction myFunction;


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scale scale = new Scale();

        var list = calculator.calculate(180);
        var height = 400;
        var scaledList = list.stream().map(element -> scale.apply(element, height)).toList();
        var maxXValue = scaledList.getLast().t();

        list.forEach(System.out::println);
        System.out.println(list.size());

        Drawer drawer = new Drawer(scaledList, height);
        drawer.draw(height + 40, maxXValue.intValue());
    }
}