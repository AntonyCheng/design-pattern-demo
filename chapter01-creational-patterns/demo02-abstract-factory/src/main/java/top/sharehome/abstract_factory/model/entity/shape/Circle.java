package top.sharehome.abstract_factory.model.entity.shape;

import top.sharehome.abstract_factory.model.Shape;

/**
 * 圆形类
 *
 * @author AnronyCheng
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形...");
    }
}
