package top.sharehome.builder;

import top.sharehome.builder.model.Meal;
import top.sharehome.builder.model.MealBuilder;

/**
 * 建造者设计模式
 *
 * @author AntonyCheng
 */

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("全素套餐");
        vegMeal.showItems();
        System.out.printf("总价: %.2f\n", vegMeal.getCost());

        System.out.println();

        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        System.out.println("鸡肉套餐");
        chickenMeal.showItems();
        System.out.printf("总价: %.2f\n", chickenMeal.getCost());

        System.out.println();

        Meal allBurger = mealBuilder.prepareAllBurger();
        System.out.println("汉堡全家桶");
        allBurger.showItems();
        System.out.printf("总价: %.2f\n", allBurger.getCost());

        System.out.println();

        Meal allColdDrink = mealBuilder.prepareAllColdDrink();
        System.out.println("冷饮全家桶");
        allColdDrink.showItems();
        System.out.printf("总价: %.2f\n", allColdDrink.getCost());

    }
}
