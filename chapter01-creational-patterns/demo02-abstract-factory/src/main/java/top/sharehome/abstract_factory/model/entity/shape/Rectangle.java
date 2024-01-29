package top.sharehome.abstract_factory.model.entity.shape;

import top.sharehome.abstract_factory.model.Shape;

/**
 * 长方形类
 *
 * @author AnronyCheng
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个长方形...");
    }
}
