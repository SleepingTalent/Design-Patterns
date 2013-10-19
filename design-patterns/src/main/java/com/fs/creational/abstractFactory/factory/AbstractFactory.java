package com.fs.creational.abstractFactory.factory;

public abstract class AbstractFactory<T,E> {
    public abstract T createItem(E itemType) throws InvalidItemException;
}
