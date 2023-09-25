package com.company;

public class Student extends Person{

    int id = 12345;

    public Student(){}

    @Override
    public void say(String func) {

    }

    public Student (int id, int height){
        this.id = id;
        super.height=height;
    }

    @Override
    public void say() {
        System.out.println("Student");
    }
}
