package top.sharehome.builder.model;

import top.sharehome.builder.model.entity.item.burger.ChickenBurger;
import top.sharehome.builder.model.entity.item.burger.VegBurger;
import top.sharehome.builder.model.entity.item.cold_drink.Coke;
import top.sharehome.builder.model.entity.item.cold_drink.Pepsi;

/**
 * 食物建造者类
 *
 * @author AntonyCheng
 */

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
