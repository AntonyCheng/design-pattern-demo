package top.sharehome.abstract_factory.model;

import top.sharehome.abstract_factory.model.enums.color.ColorEnum;
import top.sharehome.abstract_factory.model.enums.shape.ShapeEnum;

/**
 * 抽象工厂类
 * @author AnronyCheng
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(ShapeEnum shape);
    public abstract Color getColor(ColorEnum color);

}
