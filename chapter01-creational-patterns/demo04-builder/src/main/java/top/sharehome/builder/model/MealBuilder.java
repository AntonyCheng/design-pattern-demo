package top.sharehome.builder.model;

import top.sharehome.builder.model.entity.item.burger.ChickenBurger;
import top.sharehome.builder.model.entity.item.burger.VegBurger;
import top.sharehome.builder.model.entity.item.cold_drink.Coke;
import top.sharehome.builder.model.entity.item.cold_drink.Pepsi;

import java.util.Random;

/**
 * 食物建造者类
 *
 * @author AntonyCheng
 */

public class MealBuilder {
    /**
     * 准备素食套餐（素食汉堡+随机冷饮）
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        if (new Random().nextInt(1, 100) % 2 == 0) {
            meal.addItem(new Coke());
        } else {
            meal.addItem(new Pepsi());
        }
        return meal;
    }

    /**
     * 准备鸡肉套餐（肌肉汉堡+随机冷饮）
     */
    public Meal prepareChickenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        if (new Random().nextInt(1, 100) % 2 == 0) {
            meal.addItem(new Coke());
        } else {
            meal.addItem(new Pepsi());
        }
        return meal;
    }

    /**
     * 准备冷饮全家桶（可口可乐+百事可乐）
     */
    public Meal prepareAllColdDrink() {
        Meal meal = new Meal();
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        return meal;
    }

    /**
     * 准备汉堡全家桶（素食汉堡+鸡肉汉堡）
     */
    public Meal prepareAllBurger() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new ChickenBurger());
        return meal;
    }
}
