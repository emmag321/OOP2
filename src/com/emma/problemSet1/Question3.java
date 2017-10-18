package com.emma.problemSet1;

import javax.swing.*;
import java.awt.*;

public class Question3 {
    public static void main(String[] args) {
        //declare attributes here

        String name, lengthAsString, breathAsString, costAsString;
        float length, breath, cost, area, totalCost;

        name = JOptionPane.showInputDialog("Please enter your name");

        lengthAsString = JOptionPane.showInputDialog("Please enter the length of your room");
        length = Float.parseFloat(lengthAsString);

        breathAsString = JOptionPane.showInputDialog("Please enter the breath of your room");
        breath = Float.parseFloat(breathAsString);

        costAsString = JOptionPane.showInputDialog("Please enter cost of carpet per sq. metre");

        //calculations here
        cost = Float.parseFloat(costAsString);
        area = length*breath;
        totalCost = area*cost;

        JTextArea textArea=new JTextArea();

        Font textAreaFont = new Font("monospaced", Font.PLAIN,12);
        textArea.setFont(textAreaFont);

        textArea.setText("Quaotation for " + name + "\nLength of room: "
         + String.format("%.2f",length) + "m" + "\nBreadth of room: "
         + String.format("%.2f",breath) + "m" + "\nTotal area of room: "
         + String.format("%.2f",area) + "sq.m" + "\nCost per square metre of carpet: "
         + String.format("%.2f",cost) + " euro" +
                "\nTotal cost of carpet:" + String.format("%.2f",totalCost) + " euro");

        JOptionPane.showMessageDialog(null,textArea,"Carpet Pricing", JOptionPane.PLAIN_MESSAGE);





    }
}
