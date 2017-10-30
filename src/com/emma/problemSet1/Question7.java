package com.emma.problemSet1;

import javax.swing.*;

public class Question7 {
    public static void main(String[] args) {

        String numAsString;
        int num;

        do
        {
            numAsString = JOptionPane.showInputDialog(null,"Please enter a number: ");
            num = Integer.parseInt(numAsString);

            if(isEven(num)== true)
            {
                JOptionPane.showMessageDialog(null,num + "is even", "Even",JOptionPane.PLAIN_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null,num + "is odd","Even",JOptionPane.PLAIN_MESSAGE);
        }while(num!=-1);

    }


public static  boolean isEven(int num)
{
    boolean even;

    if(num%2 == 0)
    {
        even = true;
    }
    else
        even = false;

    return false;
}
}
