package com.fs.creational.builderPattern.item;

import com.fs.creational.builderPattern.packing.Bottle;
import com.fs.creational.builderPattern.packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
