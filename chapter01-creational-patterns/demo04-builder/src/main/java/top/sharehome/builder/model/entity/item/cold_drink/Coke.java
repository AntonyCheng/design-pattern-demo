package top.sharehome.builder.model.entity.item.cold_drink;

import top.sharehome.builder.model.entity.item.ColdDrink;

/**
 * 可口可乐类
 *
 * @author AntonyCheng
 */

public class Coke extends ColdDrink {
    /**
     * 可口可乐名称
     */
    @Override
    public String name() {
        return "可口可乐";
    }

    /**
     * 可口可乐价格
     */
    @Override
    public float price() {
        return 3.0f;
    }
}
