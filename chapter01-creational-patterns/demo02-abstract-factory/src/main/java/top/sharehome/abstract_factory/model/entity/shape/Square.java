package top.sharehome.abstract_factory.model.entity.shape;

import top.sharehome.abstract_factory.model.Shape;

/**
 * 正方形类
 *
 * @author AnronyCheng
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个正方形...");
    }
}
