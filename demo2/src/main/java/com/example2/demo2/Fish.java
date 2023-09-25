package com.example2.demo2;

public class Fish extends Animal{
    public float lenght = 13.5f;

    @Override
    public void voice() {
        System.out.println("Бульк");
    }

    public Fish(){}

    public Fish (String name,float lenght){
        this.name=name;
        this.lenght=lenght;
    }
}
