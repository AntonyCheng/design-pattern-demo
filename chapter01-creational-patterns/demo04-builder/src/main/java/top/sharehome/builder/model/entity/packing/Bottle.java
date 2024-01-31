package top.sharehome.builder.model.entity.packing;

import top.sharehome.builder.model.interfaces.Packing;

/**
 * 瓶装打包方式类
 *
 * @author AntonyCheng
 */

public class Bottle implements Packing {
    /**
     * 瓶装打包方式名称
     */
    @Override
    public String pack() {
        return "瓶装";
    }
}
