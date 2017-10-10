//Q2 complete ProblemSet0
package com.emma.assignment;

import javax.swing.*;

public class Question2 {
    public static void main(String[] args) {
        String name, initial, surname, distanceAsString;
        float lowerRate = 0.07f, higherRate = 0.10f, distance, moneyDue;

        //input
        name = JOptionPane.showInputDialog("Please enter your first name:");

        initial = JOptionPane.showInputDialog("Please enter your initial:");

        surname = JOptionPane.showInputDialog("Please enter surname");

        distanceAsString = JOptionPane.showInputDialog("Please enter distanced cycled");

        distance = Float.parseFloat(distanceAsString);

        //if else
        if(distance>0 && distance<=10)
        {
            moneyDue = distance*lowerRate;//process
        }
        else
        {
           moneyDue = distance*higherRate;//process
        }

        //output
        JOptionPane.showMessageDialog(null, "The money due to" + name + " " + initial + " "
        + surname + "is €" + String.format("%.2f",moneyDue), "Sponsored Cycle",JOptionPane.PLAIN_MESSAGE);




        //'output = String.format("name:%s\n class surname:%s\n distance cycled:%s\n total money raised:%s\n", nameInitial, surname, distanceCycled, totalMoneyEarned);
        System.exit(0);
    }

}
