package top.sharehome.builder.model.entity.item.burger;

import top.sharehome.builder.model.entity.item.Burger;

/**
 * 鸡肉汉堡类
 *
 * @author AntonyCheng
 */

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 27.2f;
    }
}
