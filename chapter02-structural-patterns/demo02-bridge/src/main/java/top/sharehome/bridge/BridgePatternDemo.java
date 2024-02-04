package top.sharehome.bridge;

import top.sharehome.bridge.model.Circle;
import top.sharehome.bridge.model.entity.GreenCircle;
import top.sharehome.bridge.model.entity.RedCircle;

/**
 * 桥接设计模式
 *
 * @author AntonyCheng
 */

public class BridgePatternDemo {

    /**
     * 方法入口
     */
    public static void main(String[] args) {
        Circle redCircle = new Circle(10, 100, 100, new RedCircle());
        Circle greenCircle = new Circle(10, 100, 100, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
