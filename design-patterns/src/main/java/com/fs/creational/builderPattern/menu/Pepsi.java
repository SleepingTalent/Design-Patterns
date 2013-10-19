package com.fs.creational.builderPattern.menu;


import com.fs.creational.builderPattern.item.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
