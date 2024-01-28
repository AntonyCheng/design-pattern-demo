package top.sharehome.factory.model.entity;

import top.sharehome.factory.model.Shape;

/**
 * 长方形类
 *
 * @author AntonyCheng
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个长方形...");
    }
}
