package top.sharehome.builder.model.entity.item;

import top.sharehome.builder.model.entity.packing.Bottle;
import top.sharehome.builder.model.interfaces.Item;
import top.sharehome.builder.model.interfaces.Packing;

/**
 * 冷饮抽象类
 *
 * @author AntonyCheng
 */

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
