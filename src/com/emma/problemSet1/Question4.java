package com.emma.problemSet1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, nameCaps, surName;
        int length, surNameIndex;
        char initial;

        System.out.print("Please enter your full name:");
        name = input.nextLine();

        length = name.length();
        initial = name.charAt(0);
        nameCaps = name.toUpperCase();
        surNameIndex = name.lastIndexOf(" ");
        surName = name.substring(surNameIndex);

        System.out.print("The number of characters in your name is " + length + "\nThe initial of your " +
        "first name is: " + initial + "\nThe name you entered is : " +nameCaps + "\nYour surname is: " +
        surName);

    }
}
