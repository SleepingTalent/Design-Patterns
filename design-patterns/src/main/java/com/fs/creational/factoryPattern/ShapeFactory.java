package com.fs.creational.factoryPattern;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(ShapeType shapeType) throws InvalidShapeException {

        if (shapeType == null) {
            throw new InvalidShapeException();
        }

        if (shapeType.equals(ShapeType.CIRCLE)) {
            return new Circle();
        } else if (shapeType.equals(ShapeType.RECTANGLE)) {
            return new Rectangle();
        } else if (shapeType.equals(ShapeType.SQUARE)) {
            return new Square();
        } else {
            throw new InvalidShapeException();
        }
    }
}
