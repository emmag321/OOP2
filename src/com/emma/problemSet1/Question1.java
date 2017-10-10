//Q1 complete ProblemSet1 10/10/2017
package com.emma.problemSet1;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float rate, sum, result;

        System.out.print("Please enter the exchange rate:");
        rate = input.nextFloat();

        do{
            System.out.print("Please enter the sum of money you would like to convert:");
            sum = input.nextFloat();

            result = sum*rate;

            if(sum ==0)
            {
                System.out.println("You have chosen to quit, godbye");
            }
            else
            {
                System.out.println("£" + sum + "is equal to €" + String.format("%.2f",result));
            }
        }while(sum!=0);
    }
}
