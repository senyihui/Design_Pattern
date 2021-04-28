package creational.builder;

import creational.builder.model.ChickenBurger;
import creational.builder.model.Coke;
import creational.builder.model.Pepsi;
import creational.builder.model.VerBurger;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VerBurger());
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
