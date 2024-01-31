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
    /**
     * 冷饮打包方式
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 冷饮价格
     */
    @Override
    public abstract float price();
}
