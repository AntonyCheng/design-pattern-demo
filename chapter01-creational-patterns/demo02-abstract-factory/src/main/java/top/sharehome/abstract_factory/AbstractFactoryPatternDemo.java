package top.sharehome.abstract_factory;

import top.sharehome.abstract_factory.model.interfaces.Color;
import top.sharehome.abstract_factory.model.FactoryProducer;
import top.sharehome.abstract_factory.model.interfaces.Shape;
import top.sharehome.abstract_factory.model.enums.FactoryEnum;
import top.sharehome.abstract_factory.model.enums.color.ColorEnum;
import top.sharehome.abstract_factory.model.enums.shape.ShapeEnum;

/**
 * 抽象工厂设计模式
 *
 * @author AntonyCheng
 */

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        // 获取Circle对象
        Shape circle = factoryProducer.getFactory(FactoryEnum.SHAPE).getShape(ShapeEnum.CIRCLE);
        circle.draw();

        // 获取Rectangle对象
        Shape rectangle = factoryProducer.getFactory(FactoryEnum.SHAPE).getShape(ShapeEnum.RECTANGLE);
        rectangle.draw();

        // 获取Square对象
        Shape square = factoryProducer.getFactory(FactoryEnum.SHAPE).getShape(ShapeEnum.SQUARE);
        square.draw();

        // 获取Red对象
        Color red = factoryProducer.getFactory(FactoryEnum.COLOR).getColor(ColorEnum.RED);
        red.fill();

        // 获取Blue对象
        Color blue = factoryProducer.getFactory(FactoryEnum.COLOR).getColor(ColorEnum.BLUE);
        blue.fill();

        // 获取Green对象
        Color green = factoryProducer.getFactory(FactoryEnum.COLOR).getColor(ColorEnum.GREEN);
        green.fill();

    }

}
