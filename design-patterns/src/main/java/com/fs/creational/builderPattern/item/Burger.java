package com.fs.creational.builderPattern.item;

import com.fs.creational.builderPattern.packing.Packing;
import com.fs.creational.builderPattern.packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
