package com.example2.demo2;

public class Dog extends Animal{
    public int height = 12;
    public float weight = 23.5f;

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    public Dog(){}

    public Dog(String name, int height, float weight){
        this.name = name;
        this.height = height;
        this.weight=weight;
    }
}
