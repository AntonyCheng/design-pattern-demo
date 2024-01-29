package top.sharehome.singleton.demos;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 *
 * @author AntonyCheng
 */
public class Demo4Singleton {
    // 创建 Demo4Singleton 的一个可见性对象，不要初始化它
    private volatile static Demo4Singleton instance;
    // 让构造函数为 private，这样该类就不会被实例化
    private Demo4Singleton (){}
    // 第一次调用 getInstance 方法时，在双重判定且线程安全的情况下实例化一次
    public static Demo4Singleton getInstance() {
        if (instance == null) {
            synchronized (Demo4Singleton.class) {
                if (instance == null) {
                    instance = new Demo4Singleton();
                }
            }
        }
        return instance;
    }
}
