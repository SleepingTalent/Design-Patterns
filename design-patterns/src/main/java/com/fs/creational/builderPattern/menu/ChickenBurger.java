package com.fs.creational.builderPattern.menu;

import com.fs.creational.builderPattern.item.Burger;


public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
