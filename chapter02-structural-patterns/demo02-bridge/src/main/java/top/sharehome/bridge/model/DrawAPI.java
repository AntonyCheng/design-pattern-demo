package top.sharehome.bridge.model;

/**
 * 绘画接口
 * @author AntonyCheng
 */

public interface DrawAPI {
    /**
     * 绘画圆形方法
     * @param radius 半径
     * @param x x轴坐标
     * @param y y轴坐标
     */
    void drawCircle(int radius,int x,int y);
}
