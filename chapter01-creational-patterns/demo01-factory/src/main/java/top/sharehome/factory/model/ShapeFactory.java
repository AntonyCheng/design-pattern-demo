package top.sharehome.factory.model;

import top.sharehome.factory.model.entity.Circle;
import top.sharehome.factory.model.entity.Rectangle;
import top.sharehome.factory.model.entity.Square;

/**
 * 形状工厂类
 *
 * @author AntonyCheng
 */

public class ShapeFactory {
    /**
     * 获取形状对象
     */
    public Shape getShape(ShapeEnum shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (ShapeEnum.CIRCLE.equals(shapeType)) {
            return new Circle();
        } else if (ShapeEnum.RECTANGLE.equals(shapeType)) {
            return new Rectangle();
        } else if (ShapeEnum.SQUARE.equals(shapeType)) {
            return new Square();
        }
        return null;
    }

}
