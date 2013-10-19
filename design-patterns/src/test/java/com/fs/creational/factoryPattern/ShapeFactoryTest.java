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
    }
}
