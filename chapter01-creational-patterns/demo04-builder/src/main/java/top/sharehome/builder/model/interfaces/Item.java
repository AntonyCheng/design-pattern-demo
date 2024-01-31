package top.sharehome.builder.model.interfaces;

/**
 * 食物条目接口
 *
 * @author AntonyCheng
 */

public interface Item {
    /**
     * 食物名称
     */
    public String name();

    /**
     * 食物打包方式
     */
    public Packing packing();

    /**
     * 食物价格
     */
    public float price();
}
