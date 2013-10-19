package com.fs.creational.bulderPattern;

import com.fs.common.BaseUnitTest;
import com.fs.creational.builderPattern.Meal;
import com.fs.creational.builderPattern.MealBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MealBuilderTest extends BaseUnitTest {

    MealBuilder mealBuilder;

    @Before
    public void setUp() {
        mealBuilder = new MealBuilder();
    }

    @Test
    public void prepareVegMeal_costsAsExpected() {
        Meal vegMeal = mealBuilder.prepareVegMeal();

        Assert.assertEquals(2, vegMeal.getItems().size());

        Assert.assertEquals("Veg Burger", vegMeal.getItems().get(0).name());
        Assert.assertEquals("Wrapper", vegMeal.getItems().get(0).packing().pack());
        Assert.assertEquals(new Double(25.0), Double.valueOf(vegMeal.getItems().get(0).price()));

        Assert.assertEquals("Coke", vegMeal.getItems().get(1).name());
        Assert.assertEquals("Bottle", vegMeal.getItems().get(1).packing().pack());
        Assert.assertEquals(new Double(30.0), Double.valueOf(vegMeal.getItems().get(1).price()));

        Assert.assertEquals(new Double(55.0), Double.valueOf(vegMeal.getCost()));
    }

    @Test
    public void prepareNonVegMeal_costsAsExpected() {
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        Assert.assertEquals(2, nonVegMeal.getItems().size());

        Assert.assertEquals("Chicken Burger", nonVegMeal.getItems().get(0).name());
        Assert.assertEquals("Wrapper", nonVegMeal.getItems().get(0).packing().pack());
        Assert.assertEquals(new Double(50.0), Double.valueOf(nonVegMeal.getItems().get(0).price()));

        Assert.assertEquals("Pepsi", nonVegMeal.getItems().get(1).name());
        Assert.assertEquals("Bottle", nonVegMeal.getItems().get(1).packing().pack());
        Assert.assertEquals(new Double(30.0), Double.valueOf(nonVegMeal.getItems().get(1).price()));

        Assert.assertEquals(new Double(80.0), Double.valueOf(nonVegMeal.getCost()));
    }
}
