package com.fs.creational.abstractFactory;

import com.fs.common.BaseUnitTest;
import com.fs.creational.abstractFactory.factory.AbstractFactory;
import com.fs.creational.abstractFactory.factory.InvalidItemException;
import com.fs.creational.abstractFactory.factory.colour.Colour;
import com.fs.creational.abstractFactory.factory.colour.ColourType;
import com.fs.creational.abstractFactory.factory.colour.InvalidColourException;
import com.fs.creational.abstractFactory.factory.shape.InvalidShapeException;
import com.fs.creational.abstractFactory.factory.shape.Shape;
import com.fs.creational.abstractFactory.factory.shape.ShapeType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactoryProducerTest extends BaseUnitTest {

    FactoryProducer factoryProducer;

    AbstractFactory<Shape,ShapeType> shapeFactory;

    AbstractFactory<Colour,ColourType> colourFactory;

    @Before
    public void setUp() throws InvalidFactoryException {
        factoryProducer = new FactoryProducer();

        shapeFactory = factoryProducer.getFactory(FactoryType.SHAPE_FACTORY);
        colourFactory = factoryProducer.getFactory(FactoryType.COLOUR_FACTORY);
    }

    @Test(expected = InvalidFactoryException.class)
    public void getFactory_throwsInvalidFactoryException_ifFactoryTypeIsNull() throws InvalidFactoryException {
        factoryProducer.getFactory(null);
    }


    @Test(expected = InvalidFactoryException.class)
    public void getFactory_throwsInvalidFactoryException_ifFactoryTypeIsNotExpected() throws InvalidFactoryException {
        factoryProducer.getFactory(FactoryType.UKNOWN_FACTORY);
    }

    @Test(expected = InvalidShapeException.class)
    public void createItem_throwsInvalidShapeException_ifShapeTypeIsNull() throws InvalidItemException {
        shapeFactory.createItem(null);
    }

    @Test(expected = InvalidColourException.class)
    public void createItem_throwsInvalidColourException_ifColourTypeIsNull() throws InvalidItemException {
        colourFactory.createItem(null);
    }

    @Test(expected = InvalidShapeException.class)
    public void createItem_throwsInvalidShapeException_ifShapeTypeIsNotExpected() throws InvalidItemException {
        shapeFactory.createItem(ShapeType.HEXAGON);
    }

    @Test(expected = InvalidColourException.class)
    public void createItem_throwsInvalidColourException_ifColourTypeIsNotExpected() throws InvalidItemException {
        colourFactory.createItem(ColourType.BLACK);
    }

    @Test
    public void createItem_returnsCircleTypeAsExpected() throws InvalidItemException {
        Shape circle = shapeFactory.createItem(ShapeType.CIRCLE);
        Assert.assertEquals("Inside Circle::draw() method.", circle.draw());
        Assert.assertEquals("com.fs.creational.abstractFactory.factory.shape.Circle", circle.getClass().getName());
    }

    @Test
    public void createItem_returnsSquareTypeAsExpected() throws InvalidItemException {
        Shape square = shapeFactory.createItem(ShapeType.SQUARE);
        Assert.assertEquals("Inside Square::draw() method.", square.draw());
        Assert.assertEquals("com.fs.creational.abstractFactory.factory.shape.Square", square.getClass().getName());
    }

    @Test
    public void createItem_returnsRectangleTypeAsExpected() throws InvalidItemException {
        Shape rectangle = shapeFactory.createItem(ShapeType.RECTANGLE);
        Assert.assertEquals("Inside Rectangle::draw() method.", rectangle.draw());
        Assert.assertEquals("com.fs.creational.abstractFactory.factory.shape.Rectangle", rectangle.getClass().getName());
    }

    @Test
    public void createItem_returnsRedTypeAsExpected() throws InvalidItemException {
        Colour red = colourFactory.createItem(ColourType.RED);
        Assert.assertEquals("Inside Red::draw() method.", red.draw());
        Assert.assertEquals("com.fs.creational.abstractFactory.factory.colour.Red", red.getClass().getName());
    }

    @Test
    public void createItem_returnsBlueTypeAsExpected() throws InvalidItemException {
        Colour blue = colourFactory.createItem(ColourType.BLUE);
        Assert.assertEquals("Inside Blue::draw() method.", blue.draw());
        Assert.assertEquals("com.fs.creational.abstractFactory.factory.colour.Blue", blue.getClass().getName());
    }

    @Test
    public void createItem_returnsGreenTypeAsExpected() throws InvalidItemException {
        Colour green = colourFactory.createItem(ColourType.GREEN);
        Assert.assertEquals("Inside Green::draw() method.", green.draw());
        Assert.assertEquals("com.fs.creational.abstractFactory.factory.colour.Green", green.getClass().getName());
    }
}
