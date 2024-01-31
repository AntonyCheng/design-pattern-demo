package top.sharehome.abstract_factory.model.factory;

import top.sharehome.abstract_factory.model.AbstractFactory;
import top.sharehome.abstract_factory.model.interfaces.Color;
import top.sharehome.abstract_factory.model.interfaces.Shape;
import top.sharehome.abstract_factory.model.entity.color.Blue;
import top.sharehome.abstract_factory.model.entity.color.Green;
import top.sharehome.abstract_factory.model.entity.color.Red;
import top.sharehome.abstract_factory.model.enums.color.ColorEnum;
import top.sharehome.abstract_factory.model.enums.shape.ShapeEnum;

/**
 * 颜色工厂类
 *
 * @author AntonyCheng
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeEnum shape) {
        return null;
    }

    /**
     * 获取颜色对象
     */
    @Override
    public Color getColor(ColorEnum color) {
        if (color == null) {
            return null;
        }
        if (ColorEnum.RED.equals(color)) {
            return new Red();
        } else if (ColorEnum.BLUE.equals(color)) {
            return new Blue();
        } else if (ColorEnum.GREEN.equals(color)) {
            return new Green();
        }
        return null;
    }

}
