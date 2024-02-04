package top.sharehome.bridge.model;

/**
 * 圆形类
 *
 * @author AntonyCheng
 */

public class Circle extends Shape {

    private int radius;

    private int x;

    private int y;

    public Circle(int radius, int x, int y, DrawAPI drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
