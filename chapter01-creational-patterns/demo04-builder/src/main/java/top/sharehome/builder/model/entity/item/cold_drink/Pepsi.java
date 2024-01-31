package top.sharehome.builder.model.entity.item.cold_drink;

import top.sharehome.builder.model.entity.item.ColdDrink;

/**
 * 百事可乐类
 *
 * @author AntonyCheng
 */

public class Pepsi extends ColdDrink {
    /**
     * 百事可乐名称
     */
    @Override
    public String name() {
        return "百事可乐";
    }

    /**
     * 百事可乐价格
     */
    @Override
    public float price() {
        return 3.5f;
    }
}
