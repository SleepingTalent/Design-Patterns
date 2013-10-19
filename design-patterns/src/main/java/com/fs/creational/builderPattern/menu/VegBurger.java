package com.fs.creational.builderPattern.menu;

import com.fs.creational.builderPattern.item.Burger;


public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
