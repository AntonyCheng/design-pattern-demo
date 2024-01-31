package top.sharehome.builder.model.entity.item.burger;

import top.sharehome.builder.model.entity.item.Burger;

/**
 * 素食汉堡类
 *
 * @author AntonyCheng
 */

public class VegBurger extends Burger {
    /**
     * 素食汉堡名称
     */
    @Override
    public String name() {
        return "素食汉堡";
    }

    /**
     * 素食汉堡价格
     */
    @Override
    public float price() {
        return 13.6f;
    }
}
