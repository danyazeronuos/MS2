package org.example;

import org.example.utils.Drawer;
import org.example.utils.LibCalculator;
import org.example.utils.Scale;

public class Main {

    public static void main(String[] args) {
        var calculator = new LibCalculator();
        Scale scale = new Scale();

        var list = calculator.calculate(180);
        var height = 400;
        var scaledList = list.stream().map(element -> scale.apply(element, height)).toList();
        var maxXValue = scaledList.getLast().t();

        list.forEach(System.out::println);
        System.out.println(list.size());

        Drawer drawer = new Drawer(scaledList, height);
        drawer.draw(height + 80, maxXValue.intValue());
    }
}