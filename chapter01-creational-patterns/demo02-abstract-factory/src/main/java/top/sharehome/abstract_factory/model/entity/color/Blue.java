package top.sharehome.abstract_factory.model.entity.color;

import top.sharehome.abstract_factory.model.interfaces.Color;

/**
 * 蓝色类
 *
 * @author AntonyCheng
 */
public class Blue implements Color {
    /**
     * 填充颜色
     */
    @Override
    public void fill() {
        System.out.println("填充蓝色...");
    }
}
