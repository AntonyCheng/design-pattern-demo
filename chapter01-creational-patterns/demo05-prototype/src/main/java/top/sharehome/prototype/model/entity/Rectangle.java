package top.sharehome.prototype.model.entity;

import top.sharehome.prototype.model.Shape;

/**
 * 长方形类
 *
 * @author AntonyCheng
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("drawing rectangle...");
    }

}
