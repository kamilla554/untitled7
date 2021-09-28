package com.company;

abstract public class Dish {
    boolean broken;
    String color;
    boolean holiday;
    boolean full;
    void broke()
    {
        broken=false;
        holiday=false;
    }
    void setFull()
    {
        full=true;
    }
    abstract void kindOfFood(String food);
}
