package top.sharehome.prototype.model.entity;

import top.sharehome.prototype.model.Shape;

/**
 * 正方形类
 *
 * @author AntonyCheng
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("drawing square...");
    }

}
