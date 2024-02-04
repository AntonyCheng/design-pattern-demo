package top.sharehome.bridge.model;

/**
 * 形状抽象类
 *
 * @author AntonyCheng
 */

public abstract class Shape {
    protected DrawAPI drawApi;

    protected Shape(DrawAPI drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
