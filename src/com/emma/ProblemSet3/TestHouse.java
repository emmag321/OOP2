package com.emma.ProblemSet3;

public class TestHouse{
    public static void main(String args[])
    {
        House h1 = new House();
        House h2 = new House();
        House h3 = new House();

        double price;

        h2.setAddress("Anywhere, anyplace");
        h2.setType("3 bedroom bungalow");
        h2.setPrice(300000);
        h2.setOwner("Marilyn Monroe", 35, 'F');

        h3.setAddress("Ahamore, Causeway");
        h3.setType("4 bedroom bungalow");
        h3.setPrice(350000);
        h3.setOwner("emma griffin", 30, 'F');


        price = h2.getPrice();

        if(price<0)
        {
            h2.setPrice(0);
        }

        System.out.println(h1.toString() + "\n\n" + h2.toString() + "\n\n" + h3.toString());

    }
}
