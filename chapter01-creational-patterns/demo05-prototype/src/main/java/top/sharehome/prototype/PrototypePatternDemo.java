package top.sharehome.prototype;

import top.sharehome.prototype.model.Shape;
import top.sharehome.prototype.model.ShapeCache;

/**
 * 原型设计模式
 *
 * @author AntonyCheng
 */

public class PrototypePatternDemo {

    public static void main(String[] args) {
        Shape circle = ShapeCache.getShape("1");
        System.out.println(circle);

        Shape square = ShapeCache.getShape("2");
        System.out.println(square);

        Shape rectangle = ShapeCache.getShape("3");
        System.out.println(rectangle);
    }

}
