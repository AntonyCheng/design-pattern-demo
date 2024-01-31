package top.sharehome.abstract_factory.model.entity.color;

import top.sharehome.abstract_factory.model.interfaces.Color;

/**
 * 绿色类
 *
 * @author AntonyCheng
 */
public class Green implements Color {
    /**
     * 填充颜色
     */
    @Override
    public void fill() {
        System.out.println("填充绿色...");
    }
}
