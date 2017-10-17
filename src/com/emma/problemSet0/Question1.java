package com.emma.assigns;

        import javax.swing.*; //import statement
        import javax.swing.JTextArea; //import statement

public class Question1 {

    public static void main(String[] args) {
        String name, className, snacksAsString, output;
        int numSnacks, totalCost;

        //input
        name = JOptionPane.showInputDialog("PLease enter your name");//assigning values
        className = JOptionPane.showInputDialog("Please enter youe class");//assigning values
        snacksAsString=JOptionPane.showInputDialog("How many snacks would you like??");

        //process
        numSnacks = Integer.parseInt(snacksAsString);

        //calculation
        totalCost = numSnacks * 2;

        //result
        output = String.format("name:%s\n class name:%s\n total cost:%s\n", name, className, totalCost);

        JOptionPane.showMessageDialog(null, output, "Restuarant",JOptionPane.INFORMATION_MESSAGE);



    }
}
