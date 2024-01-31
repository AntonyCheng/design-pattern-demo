package top.sharehome.factory.model.entity;

import top.sharehome.factory.model.Shape;

/**
 * 圆形类
 *
 * @author AntonyCheng
 */

public class Circle implements Shape {
    /**
     * 绘画形状
     */
    @Override
    public void draw() {
        System.out.println("画一个圆形...");
    }
}
