//Q3 not complete
package com.emma.assignment;

import javax.swing.*;

public class Question3 {
    public static void main(String[] args) {
        float income, taxDue, netAfterTax;
        String name, taxRate, incomeAsString;

        //input
        name = JOptionPane.showInputDialog("Please enter your name:");

        incomeAsString = JOptionPane.showInputDialog("Please enter your total taxable income:");

        income = Float.parseFloat(incomeAsString);

        //if else statement
        if(income>0 && income<=20000)
        {
            taxDue = 0f;
            taxRate = "0%";
        }
        else if(income>20000.01 && income<=36000)
        {
            taxDue = income*0.2f;
            taxRate= "20%";
        }
        else
        {
            taxDue = income*0.41f;
            taxRate = "41%";
        }

        netAfterTax = income - taxDue;

        JOptionPane.showMessageDialog(null,"Name: \t" + name +  "\nGross Income:\t â‚¬" + String.format("%.2f",income)+
                        "\nTax Rate:\t " + taxRate + "\nTax Due:\t â‚¬" + String.format("%.2f",taxDue) +
                        "\nIncome After Tax: \t â‚¬" + String.format("%.2f",netAfterTax),"Tax & Income",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}//end
