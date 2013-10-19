package com.fs.creational.abstractFactory;


import com.fs.creational.abstractFactory.factory.AbstractFactory;
import com.fs.creational.abstractFactory.factory.colour.ColourFactory;
import com.fs.creational.abstractFactory.factory.shape.ShapeFactory;

public class FactoryProducer {

    public AbstractFactory getFactory(FactoryType factoryType) throws InvalidFactoryException {

        if(factoryType == null) {
            throw new InvalidFactoryException();
        }

        if(factoryType.equals(FactoryType.SHAPE_FACTORY)){
            return new ShapeFactory();
        } else if(factoryType.equals(FactoryType.COLOUR_FACTORY)){
            return new ColourFactory();
        }else {
            throw new InvalidFactoryException();
        }
    }
}
