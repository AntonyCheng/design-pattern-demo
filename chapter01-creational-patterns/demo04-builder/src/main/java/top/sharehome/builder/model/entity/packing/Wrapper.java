package top.sharehome.builder.model.entity.packing;

import top.sharehome.builder.model.interfaces.Packing;

/**
 * 袋装打包方式类
 *
 * @author AntonyCheng
 */

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
