package top.sharehome.bridge.model.entity;

import top.sharehome.bridge.model.DrawAPI;

/**
 * 绿色圆形类
 *
 * @author AntonyCheng
 */

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
