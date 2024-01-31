package top.sharehome.singleton.demos;

/**
 * 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 *
 * @author AntonyCheng
 */
public class Demo1Singleton {
    /**
     * 创建 Demo1Singleton 的一个对象，不要初始化它
     */
    private static Demo1Singleton instance;

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private Demo1Singleton() {
    }

    /**
     * 在线程不安全的情况调用 getInstance 方法时，第一次在线程不安全的情况下实例化一次
     */
    public static Demo1Singleton getInstance() {
        if (instance == null) {
            instance = new Demo1Singleton();
        }
        return instance;
    }
}
