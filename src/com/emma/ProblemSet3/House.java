package com.emma.ProblemSet3;

public class House {

    //attributes
    private String address;
    private String type;
    private double price;
    private Person owner;

    //constructors
    public House(){

        this("No Address Specified", "No Type Specified", 0.0, "No Owner Specified");

    }

    public House(String address, String type, double price, String name){
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

        return "Address: " + address + "\nType: " + type + "\nPrice: " + price + "\nOwner" + owner ;
    }

    public void setOwner(String marilyn_monroe, int i, char f) {
    }
}
