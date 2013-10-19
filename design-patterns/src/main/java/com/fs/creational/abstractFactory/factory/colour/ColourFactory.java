package com.fs.creational.abstractFactory.factory.colour;

import com.fs.creational.abstractFactory.factory.AbstractFactory;
import com.fs.creational.abstractFactory.factory.InvalidItemException;

public class ColourFactory extends AbstractFactory<Colour,ColourType>{

    @Override
    public Colour createItem(ColourType itemType) throws InvalidItemException {
        if (itemType == null) {
            throw new InvalidColourException();
        }

        if (itemType.equals(ColourType.RED)) {
            return new Red();
        } else if (itemType.equals(ColourType.GREEN)) {
            return new Green();
        } else if (itemType.equals(ColourType.BLUE)) {
            return new Blue();
        } else {
            throw new InvalidColourException();
        }

    }
}
