package com.emma.problemSet1;

//MeasurementTextArea.java
/**/

        import javax.swing.*;
        import java.awt.*;

public class Question2{
    public static void main(String args[])
    {
        int yards=0, inches=0;

        JTextArea textArea = new JTextArea();

        textArea.setText("Yards\t\tInches\n------\t\t------");

        for(int i=1; i<=10; i++)
        {
            yards++;
            inches = yards*36;

            textArea.append("\n" + yards + "\t\t" + inches + "\n");
        }

        JOptionPane.showMessageDialog(null, textArea, "Yards and Inches Table",
                JOptionPane.PLAIN_MESSAGE);
    }
}
