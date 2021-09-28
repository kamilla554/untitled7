package com.company;

public class Husky extends Dog{
    @Override
    void walkTheDog() {
        if (Math.random()>0.5) System.out.println("Вы выгуляли собаку!");
        else System.out.println("Хаски оглушил вас воем. Вы вернулись домой глухим.");
    }
}
