package top.sharehome.abstract_factory.model.entity.color;

import top.sharehome.abstract_factory.model.Color;

/**
 * 蓝色类
 *
 * @author AntonyCheng
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("填充蓝色...");
    }
}
