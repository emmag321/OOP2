package com.emma.ProblemSet3;

public class Person {

    //attributes
    private String name;
    private int age;
    private char gender;


    //mutators
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    //accessors
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public char getGender()
    {
        return gender;
    }

    //toString Method
    public String toString()
    {
        return name + "\t" + age + "\t" + gender;
    }


}
