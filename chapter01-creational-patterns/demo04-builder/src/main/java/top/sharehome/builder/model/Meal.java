package top.sharehome.builder.model;

import top.sharehome.builder.model.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 食物类
 *
 * @author AntonyCheng
 */

public class Meal {
    /**
     * 食物条目集合
     */
    private List<Item> items = new ArrayList<Item>();

    /**
     * 添加食物条目
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 获取所有食物的总价
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 展示所有食物条目
     */
    public void showItems() {
        for (Item item : items) {
            System.out.print("食物条目 : " + item.name());
            System.out.print(", 打包方式 : " + item.packing().pack());
            System.out.println(", 单价 : " + item.price());
        }
    }
}
