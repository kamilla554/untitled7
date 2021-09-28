package com.company;

public class Pomeranian extends Dog{

    @Override
    void walkTheDog() {
        if (Math.random()>0.5) System.out.println("Вы выгуляли собаку!");
        else System.out.println("Вашу собаку унесло ветром. Вы вернулись домой без собаки");
    }
}
