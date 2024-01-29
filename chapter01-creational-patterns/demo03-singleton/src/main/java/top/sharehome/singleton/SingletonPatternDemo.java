package top.sharehome.singleton;

import top.sharehome.singleton.demos.*;

/**
 * 单例设计模式
 *
 * @author AntonyCheng
 */

public class SingletonPatternDemo {

    /**
     * 经验之谈：
     * 一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
     * 只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
     * 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
     * 如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
     */
    public static void main(String[] args) {
        // 懒汉式，线程不安全
        Demo1Singleton demo1Singleton = Demo1Singleton.getInstance();
        System.out.println("懒汉式（线程不安全）创建单例：" + demo1Singleton);

        // 懒汉式，线程安全
        Demo2Singleton demo2Singleton = Demo2Singleton.getInstance();
        System.out.println("懒汉式（线程安全）创建单例：" + demo2Singleton);

        // 饿汉式
        Demo3Singleton demo3Singleton = Demo3Singleton.getInstance();
        System.out.println("饿汉式创建单例：" + demo3Singleton);

        // 双检锁/双重校验锁（DCL，即 double-checked locking）
        Demo4Singleton demo4Singleton = Demo4Singleton.getInstance();
        System.out.println("双检锁/双重校验锁创建单例：" + demo4Singleton);

        // 登记式/静态内部类
        Demo5Singleton demo5Singleton = Demo5Singleton.getInstance();
        System.out.println("登记式/静态内部类创建单例：" + demo5Singleton);

        // 枚举
        Demo6Singleton demo6Singleton = Demo6Singleton.INSTANCE;
        System.out.println("枚举创建单例：" + demo6Singleton);
    }

}
