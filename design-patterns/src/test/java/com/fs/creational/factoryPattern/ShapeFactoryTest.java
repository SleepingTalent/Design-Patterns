package com.fs.creational.factoryPattern;


import com.fs.common.BaseUnitTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeFactoryTest extends BaseUnitTest {

    ShapeFactory shapeFactory;

    @Before
    public void setUp() {
        shapeFactory = new ShapeFactory();
    }

    @Test(expected = InvalidShapeException.class)
    public void getShape_throwsInvalidShapeException_ifShapeTypeIsNull() throws InvalidShapeException {
        shapeFactory.getShape(null);
    }

    @Test(expected = InvalidShapeException.class)
    public void getShape_throwsInvalidShapeException_ifShapeTypeIsNotExpected() throws InvalidShapeException {
        shapeFactory.getShape(ShapeType.HEXAGON);
    }

    @Test
    public void getShape_returnsCircleTypeAsExpected() throws InvalidShapeException {
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Assert.assertEquals("Inside Circle::draw() method.", circle.draw());
        Assert.assertEquals("com.fs.creational.factoryPattern.Circle", circle.getClass().getName());
    }

    @Test
    public void getShape_returnsRectangleTypeAsExpected() throws InvalidShapeException {
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        Assert.assertEquals("Inside Rectangle::draw() method.", rectangle.draw());
        Assert.assertEquals("com.fs.creational.factoryPattern.Rectangle", rectangle.getClass().getName());
    }

    @Test
    public void getShape_returnsSquareTypeAsExpected() throws InvalidShapeException {
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        Assert.assertEquals("Inside Square::draw() method.", square.draw());
        Assert.assertEquals("com.fs.creational.factoryPattern.Square", square.getClass().getName());
    }

    @Test
    public void abstraction_worksAsExpected() throws InvalidShapeException {
        //get an object of Red and call its draw method.
        Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);

        //call draw method of Red
        Assert.assertEquals("Inside Circle::draw() method.", shape.draw());

        //get an object of Green and call its draw method.
        shape = shapeFactory.getShape(ShapeType.RECTANGLE);

        //call draw method of Green
        Assert.assertEquals("Inside Rectangle::draw() method.", shape.draw());

        //get an object of Blue and call its draw method.
        shape = shapeFactory.getShape(ShapeType.SQUARE);

        //call draw method of circle
        Assert.assertEquals("Inside Square::draw() method.", shape.draw());
    }
}
