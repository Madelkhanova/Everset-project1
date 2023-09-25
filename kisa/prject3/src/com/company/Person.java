package com.company;

public abstract class Person {

    public int height = 170;

    public static String funcname (String name){
        String n = name;
        return n;
    }

    public void say(){
        System.out.println("default");
    }

    public Person(){}

    public Person(int height){
        this.height = height;
    }

    public abstract void say(String func);
}
