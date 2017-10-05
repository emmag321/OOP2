package com.emma.assignment;

import javax.swing.*;

/**
 * Created by t00185959 on 05/10/2017.
 */
public class Question5 {
    public static void main(String[] args) {

        String choiceAsString, firstNumAsString, secondNumAsString;
        char choice;
        float firstNum, secondNum, answer;

        choiceAsString = JOptionPane.showInputDialog(null,"Please enter your choice");
        choice = choiceAsString.charAt(0);

        firstNumAsString = JOptionPane.showInputDialog(null,"Please enter a number");
        firstNum = Float.parseFloat(firstNumAsString);

        secondNumAsString = JOptionPane.showInputDialog(null,"Please enter a number");
        secondNum = Float.parseFloat(secondNumAsString);

        switch(choice)
        {
            case 'A'://addition
                        answer = firstNum + secondNum;
                        JOptionPane.showMessageDialog(null,"The answer is" + String.format("%.2f",answer)
                                ,"Result",JOptionPane.INFORMATION_MESSAGE);
                        break;

            case 'S'://subtraction
                        answer = firstNum - secondNum;
                        JOptionPane.showMessageDialog(null,"The answer is" + String.format("%.2f",answer)
                        ,"Result",JOptionPane.INFORMATION_MESSAGE);
                         break;


            case 'M'://multiplication
                        answer = firstNum*secondNum;
                        JOptionPane.showMessageDialog(null,"The answer is" + String.format("%.2f",answer)
                        ,"Result",JOptionPane.INFORMATION_MESSAGE);
                         break;

            case 'D'://divide
                        answer = firstNum/secondNum;
                        JOptionPane.showMessageDialog(null,"The answer is" + String.format("%.2f",answer)
                        ,"Result",JOptionPane.INFORMATION_MESSAGE);
                        break;

            default:
                        JOptionPane.showMessageDialog(null,"You did not enter a correct choice","Result",
                        JOptionPane.INFORMATION_MESSAGE);
        



        }
    }
}
