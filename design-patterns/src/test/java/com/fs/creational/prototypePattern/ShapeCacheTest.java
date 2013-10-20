package com.fs.creational.prototypePattern;


import com.fs.common.BaseUnitTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCacheTest extends BaseUnitTest {

    ShapeCache shapeCache;

    @Before
    public void setUp() {
        shapeCache = new ShapeCache();

        Circle circle = new Circle();
        circle.setId("1");
        shapeCache.addShape(circle);

        Square square = new Square();
        square.setId("2");
        shapeCache.addShape(square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeCache.addShape(rectangle);
    }

    @Test
    public void getShape_returnsCircle() throws ShapeNotFoundException {
        Shape clonedShape = shapeCache.getShape("1");
        Assert.assertEquals("Circle",clonedShape.getType());
    }

    @Test
    public void getShape_returnsSquare() throws ShapeNotFoundException {
        Shape clonedShape = shapeCache.getShape("2");
        Assert.assertEquals("Square",clonedShape.getType());
    }

    @Test
    public void getShape_returnsRectangle() throws ShapeNotFoundException {
        Shape clonedShape = shapeCache.getShape("3");
        Assert.assertEquals("Rectangle",clonedShape.getType());
    }

    @Test(expected = ShapeNotFoundException.class)
    public void getShape_throwsShapeNotFoundException_IfIdNotFound() throws ShapeNotFoundException {
        shapeCache.getShape("4");
    }
}
