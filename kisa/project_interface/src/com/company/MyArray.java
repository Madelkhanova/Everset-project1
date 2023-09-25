package com.company;

public class MyArray implements Array {
    int a [] = new int[50];
    int size = 0;


    @Override
    public int get(int i) {
        return a[i];
    }

    @Override
    public boolean add(int val) {
        if( size != a.length){
            a[size]=val;
            size++;
            return true;
        }
        else {
            return false;
        }
    }

}
