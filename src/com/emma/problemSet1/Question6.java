package com.emma.problemSet1;

import javax.swing.*;

public class Question6 {
    public static void main(String[] args) {

        int num=0, cubeNum=0;

        //create jTextArea
        JTextArea textArea = new JTextArea();

        textArea.setText("Number\t\tCube\n----------\t\t----------");

        for(int i=1; i<=15; i++)
        {
            num++;
            textArea.append("\n" + num + "\t\t" + cube(num,cubeNum) + "\n");
        }

        JOptionPane.showMessageDialog(null,textArea,"Cubed Numbers",JOptionPane.PLAIN_MESSAGE);
    }
    public static int cube (int num, int cubeNum)
    {
        cubeNum = num*num*num;

        return cubeNum;
    }
}
