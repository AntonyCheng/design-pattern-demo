package top.sharehome.factory;

import top.sharehome.factory.model.Shape;
import top.sharehome.factory.model.ShapeEnum;
import top.sharehome.factory.model.ShapeFactory;

/**
 * 工厂设计模式
 *
 * @author AntonyCheng
 */

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取Circle对象
        Shape circle = shapeFactory.getShape(ShapeEnum.CIRCLE);
        circle.draw();

        // 获取Rectangle对象
        Shape rectangle = shapeFactory.getShape(ShapeEnum.RECTANGLE);
        rectangle.draw();

        // 获取Square对象
        Shape square = shapeFactory.getShape(ShapeEnum.SQUARE);
        square.draw();
    }

}
