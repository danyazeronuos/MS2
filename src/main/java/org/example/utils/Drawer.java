package org.example.utils;

import org.example.Main;
import org.example.model.Tuple;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Drawer extends JPanel {
    private List<Tuple> tupleList;
    private Integer height;

    public Drawer(List<Tuple> tupleList, Integer height) {
        this.tupleList = tupleList;
        this.height = height;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < getWidth(); i+=5) {
            g.fillOval(i, height/2, 5, 3);
        }


        for (Tuple tuple : tupleList) {

            int x = (int) Math.round(tuple.t());
            int y1 = (int) Math.round(tuple.y());
            int y2 = (int) Math.round(tuple.yi());

            var diameter = 10;
            g.setColor(Color.BLACK);
            g.fillOval(x, y1, diameter, diameter);
            g.setColor(Color.BLUE);
            g.fillOval(x, y2, diameter, diameter);
        }

        for (int i = 0; i < tupleList.size(); i+=10) {
           g.drawString(String.valueOf(i), (int) Math.round(tupleList.get(i).t()), 440);
        }

    }

    public void draw(Integer height, Integer width) {
        JFrame frame = new JFrame();
        Drawer drawer = new Drawer(this.tupleList, height);

        frame.add(drawer);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
