package top.sharehome.builder.model.entity.item.cold_drink;

import top.sharehome.builder.model.entity.item.ColdDrink;

/**
 * 可口可乐类
 *
 * @author AntonyCheng
 */

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
