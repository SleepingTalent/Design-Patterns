package com.fs.creational.builderPattern;

import com.fs.creational.builderPattern.menu.ChickenBurger;
import com.fs.creational.builderPattern.menu.Coke;
import com.fs.creational.builderPattern.menu.Pepsi;
import com.fs.creational.builderPattern.menu.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
