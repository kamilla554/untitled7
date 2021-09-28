package com.company;

public class Plates extends Dish{
    String meal;

    @Override
    void kindOfFood(String food) {
        if (full==false)System.out.println("Plate is empty");
        else System.out.println("Teapot is full of "+ meal);
    }
}
