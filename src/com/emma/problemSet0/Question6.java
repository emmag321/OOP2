//Q6 complete problemSet0
package com.emma.ProblemSet0;

import javax.swing.*;

public class Question6 {
    public static void main(String[] args) {

        String num1AsString, num2AsString, choiceAsString;
        float num1, num2, answer;
        char choice;

        do {
            choiceAsString = JOptionPane.showInputDialog(null, "please enter your ");
            choice = choiceAsString.charAt(0);

            if (choice == 'Q') {
                JOptionPane.showMessageDialog(null, "You have chosen to quit Goodbye");
            } else {
                num1AsString = JOptionPane.showInputDialog(null, "please enter the first number");
                num1 = Float.parseFloat(num1AsString);

                num2AsString = JOptionPane.showInputDialog(null, "please enter the second number");
                num2 = Float.parseFloat(num2AsString);

                if (choice == 'A') {
                    answer = num1 + num2;

                    JOptionPane.showMessageDialog(null, "The answer is" + String.format("%.2f", answer),
                            "Calculations", JOptionPane.INFORMATION_MESSAGE);
                } else if (choice == 'S') {
                    answer = num1 - num2;

                    JOptionPane.showMessageDialog(null, "The answer is" + String.format("%.2f", answer),
                            "Calculations", JOptionPane.INFORMATION_MESSAGE);

                } else if (choice == 'M') {
                    answer = num1 * num2;

                    JOptionPane.showMessageDialog(null, "The answer is" + String.format("%.2f", answer),
                            "Calculations", JOptionPane.INFORMATION_MESSAGE);
                } else if (choice == 'D') {
                    answer = num1 / num2;

                    JOptionPane.showMessageDialog(null, "The answer is" + String.format("%.2f", answer),
                            "Calculations", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "You entered the wrong choice", "Calculations", JOptionPane.ERROR_MESSAGE);
                }

            }//end of else statement
        } while (choice != 'Q'); //end of loop

        System.exit(0);
    }//end of main
}//end of full program
