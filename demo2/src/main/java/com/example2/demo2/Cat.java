package com.example2.demo2;

public class Cat extends Animal {
    public int height = 7;
    public float weight = 13.5f;

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    public Cat(){}

    public Cat(String name, int height, float weight){
        this.name = name;
        this.height = height;
        this.weight=weight;
    }
}
