package top.sharehome.abstract_factory.model.entity.shape;

import top.sharehome.abstract_factory.model.interfaces.Shape;

/**
 * 长方形类
 *
 * @author AnronyCheng
 */
public class Rectangle implements Shape {
    /**
     * 绘画形状
     */
    @Override
    public void draw() {
        System.out.println("画一个长方形...");
    }
}
