package top.sharehome.prototype.model;

import top.sharehome.prototype.model.entity.Circle;
import top.sharehome.prototype.model.entity.Rectangle;
import top.sharehome.prototype.model.entity.Square;

import java.util.HashMap;

/**
 * 模拟形状缓存类
 *
 * @author AntonyCheng
 */
public class ShapeCache {

    /**
     * 模拟从数据库中查出了数据
     */
    private static final HashMap<String, Shape> FROM_DB_SHAPE_MAP = new HashMap<>() {
        {
            Circle circle = new Circle();
            circle.setId("1");
            Square square = new Square();
            square.setId("2");
            Rectangle rectangle = new Rectangle();
            rectangle.setId("3");
            put(circle.getId(), circle);
            put(square.getId(), square);
            put(rectangle.getId(), rectangle);
        }
    };

    /**
     * 以拷贝方式获取形状
     */
    public static Shape getShape(String shapeId) {
        Shape shape = FROM_DB_SHAPE_MAP.get(shapeId);
        return (Shape) shape.clone();
    }

}
