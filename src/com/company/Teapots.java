package com.company;

public class Teapots extends Dish{
    String tea;

    @Override
    void kindOfFood(String food) {
        if (full==false)System.out.println("Teapot is empty");
        else System.out.println("Teapot is full of "+ tea);
    }
}
