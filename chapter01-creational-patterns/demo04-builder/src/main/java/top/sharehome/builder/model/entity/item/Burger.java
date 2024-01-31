package top.sharehome.builder.model.entity.item;

import top.sharehome.builder.model.entity.packing.Wrapper;
import top.sharehome.builder.model.interfaces.Item;
import top.sharehome.builder.model.interfaces.Packing;

/**
 * 汉堡抽象类
 *
 * @author AntonyCheng
 */

public abstract class Burger implements Item {
    /**
     * 汉堡打包方式
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    /**
     * 汉堡价格
     */
    @Override
    public abstract float price();
}
