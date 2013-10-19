package com.fs.creational.builderPattern.item;

import com.fs.creational.builderPattern.packing.Packing;

public interface Item {

    public String name();
    public Packing packing();
    public float price();
}
