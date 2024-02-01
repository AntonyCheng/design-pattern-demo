package top.sharehome.prototype.model;

/**
 * 形状类
 *
 * @author AntonyCheng
 */
public abstract class Shape implements Cloneable {
    /**
     * 形状ID
     */
    private String id;

    /**
     * 形状类型
     */
    protected String type;

    /**
     * 绘画形状
     */
    protected abstract void draw();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "shape id=" + id + ", type=" + type;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
