package com.emma.problemSet1;

public class Question5 {
    public static void main(String[] args) {
        int a=1, b=6, c=-16;
        double x1,x2;

        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);

        x2 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println("The value(s) of x are: " + x1 + " and " + x2);
    }
}
