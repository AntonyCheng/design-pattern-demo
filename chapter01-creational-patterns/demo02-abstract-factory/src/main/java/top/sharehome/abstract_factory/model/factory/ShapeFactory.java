package top.sharehome.abstract_factory.model.factory;

import top.sharehome.abstract_factory.model.AbstractFactory;
import top.sharehome.abstract_factory.model.interfaces.Color;
import top.sharehome.abstract_factory.model.interfaces.Shape;
import top.sharehome.abstract_factory.model.entity.shape.Circle;
import top.sharehome.abstract_factory.model.entity.shape.Rectangle;
import top.sharehome.abstract_factory.model.entity.shape.Square;
import top.sharehome.abstract_factory.model.enums.color.ColorEnum;
import top.sharehome.abstract_factory.model.enums.shape.ShapeEnum;

/**
 * 形状工厂类
 *
 * @author AntonyCheng
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeEnum shape) {
        if (shape == null) {
            return null;
        }
        if (ShapeEnum.CIRCLE.equals(shape)) {
            return new Circle();
        } else if (ShapeEnum.SQUARE.equals(shape)) {
            return new Square();
        } else if (ShapeEnum.RECTANGLE.equals(shape)) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(ColorEnum color) {
        return null;
    }

}
