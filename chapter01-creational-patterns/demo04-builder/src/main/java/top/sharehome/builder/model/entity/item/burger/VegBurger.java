package top.sharehome.builder.model.entity.item.burger;

import top.sharehome.builder.model.entity.item.Burger;

/**
 * 素食汉堡类
 *
 * @author AntonyCheng
 */

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 13.6f;
    }
}
