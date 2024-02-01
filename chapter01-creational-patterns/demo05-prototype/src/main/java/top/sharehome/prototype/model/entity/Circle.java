package top.sharehome.prototype.model.entity;

import top.sharehome.prototype.model.Shape;

/**
 * 圆形类
 *
 * @author AntonyCheng
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("drawing circle...");
    }

}
