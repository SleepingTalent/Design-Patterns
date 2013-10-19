package com.fs.creational.builderPattern.packing;


import com.fs.creational.builderPattern.packing.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
