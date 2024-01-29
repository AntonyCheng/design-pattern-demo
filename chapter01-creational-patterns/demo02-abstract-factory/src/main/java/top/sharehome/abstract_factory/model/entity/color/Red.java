package top.sharehome.abstract_factory.model.entity.color;

import top.sharehome.abstract_factory.model.Color;

/**
 * 红色类
 *
 * @author AntonyCheng
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("填充红色...");
    }
}
