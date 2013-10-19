package com.fs.creational.builderPattern.menu;


import com.fs.creational.builderPattern.item.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
