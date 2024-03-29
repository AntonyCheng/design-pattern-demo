package top.sharehome.abstract_factory.model;

import top.sharehome.abstract_factory.model.enums.color.ColorEnum;
import top.sharehome.abstract_factory.model.enums.shape.ShapeEnum;
import top.sharehome.abstract_factory.model.interfaces.Color;
import top.sharehome.abstract_factory.model.interfaces.Shape;

/**
 * 抽象工厂类
 * @author AnronyCheng
 */
public abstract class AbstractFactory {
    /**
     * 获取形状对象
     */
    public abstract Shape getShape(ShapeEnum shape);

    /**
     * 获取颜色对象
     */
    public abstract Color getColor(ColorEnum color);

}
