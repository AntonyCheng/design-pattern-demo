package top.sharehome.abstract_factory.model;

import top.sharehome.abstract_factory.model.enums.FactoryEnum;
import top.sharehome.abstract_factory.model.factory.ColorFactory;
import top.sharehome.abstract_factory.model.factory.ShapeFactory;

/**
 * 工厂生产类
 *
 * @author AntonyCheng
 */
public class FactoryProducer {
    public AbstractFactory getFactory(FactoryEnum factory) {
        if (factory == null) {
            return null;
        }
        if (FactoryEnum.SHAPE.equals(factory)) {
            return new ShapeFactory();
        } else if (FactoryEnum.COLOR.equals(factory)) {
            return new ColorFactory();
        }
        return null;
    }
}
