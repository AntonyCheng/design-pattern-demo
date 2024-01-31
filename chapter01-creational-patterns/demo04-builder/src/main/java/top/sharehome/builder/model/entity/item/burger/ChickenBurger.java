package top.sharehome.builder.model.entity.item.burger;

import top.sharehome.builder.model.entity.item.Burger;

/**
 * 鸡肉汉堡类
 *
 * @author AntonyCheng
 */

public class ChickenBurger extends Burger {
    /**
     * 鸡肉汉堡名称
     */
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    /**
     * 鸡肉汉堡价格
     */
    @Override
    public float price() {
        return 27.2f;
    }
}
