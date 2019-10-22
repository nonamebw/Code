package designPatterns.singleton;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/18 12:18
 */
public class StaticSingleton {

    private StaticSingleton(){

    }

    public static StaticSingleton getInstance(){  //这个方法被调用时，才会使用静态内部类创建实例。
                                                  // 并利用类加载机制，保证线程安全。
        return SingletonHolder.singleton;
    }

    private static class SingletonHolder{
        private static StaticSingleton singleton = new StaticSingleton();
    }
}
