//Question 4 complete ProblemSet0
package com.emma.ProblemSet0;

import javax.swing.*;

public class Question4 {
    public static void main(String[] args) {

        String numberAsString;
        int number, total = 0, count = 0;

        numberAsString = JOptionPane.showInputDialog(null,"Please enter a number(posititve, negative or zero");
        number = Integer.parseInt(numberAsString);

        while(!numberAsString.equals("q"))
        {
            numberAsString = JOptionPane.showInputDialog(null,"Please enter a number(posititve, negative or zero");

            total += number;//keeps adding the numbers here
            count++;// counts all the indiviaual inputs here !!
        }

        JOptionPane.showMessageDialog(null,"Total:\t\t" + total + "\nNumber of entries:\t\t" + count , "Numbers:",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}//end
