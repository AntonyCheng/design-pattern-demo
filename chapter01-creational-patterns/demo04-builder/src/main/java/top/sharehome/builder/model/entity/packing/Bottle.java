package top.sharehome.builder.model.entity.packing;

import top.sharehome.builder.model.interfaces.Packing;

/**
 * 瓶装打包方式类
 *
 * @author AntonyCheng
 */

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
