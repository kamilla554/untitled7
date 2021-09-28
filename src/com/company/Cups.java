package com.company;

public class Cups extends Dish{
    String water;


    @Override
    void kindOfFood(String food) {
        if (full==false)System.out.println("Cups are empty");
        else System.out.println("Cups are full of "+ water);
    }
}
