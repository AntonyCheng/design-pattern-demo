package top.sharehome.bridge.model.entity;

import top.sharehome.bridge.model.DrawAPI;

/**
 * 红色圆形类
 *
 * @author AntonyCheng
 */

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
