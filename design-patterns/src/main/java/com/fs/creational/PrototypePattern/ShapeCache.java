package com.fs.creational.prototypePattern;


import java.util.Hashtable;

public class ShapeCache {

    private Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public Shape getShape(String shapeId) throws ShapeNotFoundException {
        Shape cachedShape = shapeMap.get(shapeId);

        if(cachedShape == null) {
          throw new ShapeNotFoundException();
        }

        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes
    public void addShape(Shape shape) {
        shapeMap.put(shape.getId(), shape);
    }
}
