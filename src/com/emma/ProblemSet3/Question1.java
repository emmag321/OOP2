package com.emma.ProblemSet3;

//House.java
/**/

public class Question1{

    //attributes
    private String address;
    private String type;
    private double price;
    private Person owner;

    //constructors
    public Question1(){

        this("No Address Specified", "No Type Specified", 0.0, "No Owner Specified");

    }

    public Question1(String address, String type, double price, String name){
                 //int age, char gender){

        this.address = address;
        this.type = type;
        this.price = price;
		/*this.name = name;
		this.age = age;
		this.gender = gender;*/

        owner = new Person();

    }

    //mutators
    public void setAddress(String address){

        this.address = address;
    }

    public void setType(String type){

        this.type = type;
    }

    public void setPrice(double price){

        this.price = price;
    }


    //accessors
    public String getAddress(){

        return address;
    }

    public String getType(){

        return type;
    }

    public double getPrice(){

        return price;
    }

    public String toString(){

        return "Address: " + address + "\nType: " + type + "\nPrice: " + price;
    }
}
