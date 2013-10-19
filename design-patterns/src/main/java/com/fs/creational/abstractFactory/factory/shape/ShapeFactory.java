package com.fs.creational.abstractFactory.factory.shape;

import com.fs.creational.abstractFactory.factory.AbstractFactory;
import com.fs.creational.abstractFactory.factory.InvalidItemException;

public class ShapeFactory extends AbstractFactory<Shape,ShapeType> {

    @Override
    public Shape createItem(ShapeType itemType) throws InvalidItemException{

        if (itemType == null) {
            throw new InvalidShapeException();
        }

        if (itemType.equals(ShapeType.CIRCLE)) {
            return new Circle();
        } else if (itemType.equals(ShapeType.RECTANGLE)) {
            return new Rectangle();
        } else if (itemType.equals(ShapeType.SQUARE)) {
            return new Square();
        } else {
            throw new InvalidShapeException();
        }

    }

}
