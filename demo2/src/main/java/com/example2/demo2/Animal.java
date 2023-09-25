package com.example2.demo2;

import jakarta.validation.constraints.NotEmpty;

public class Animal {
    @NotEmpty
    public String name;
    public void voice(){
        System.out.println("Голос");
    }
}
