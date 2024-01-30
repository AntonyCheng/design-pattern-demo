package top.sharehome.builder.model.entity.item.cold_drink;

import top.sharehome.builder.model.entity.item.ColdDrink;

/**
 * 百事可乐类
 *
 * @author AntonyCheng
 */

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 3.5f;
    }
}
