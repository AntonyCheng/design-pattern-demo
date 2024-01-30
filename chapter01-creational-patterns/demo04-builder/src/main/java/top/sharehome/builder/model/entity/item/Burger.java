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
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
