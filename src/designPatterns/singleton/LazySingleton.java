package designPatterns.singleton;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/18 11:25
 */
public class LazySingleton {
    private static volatile LazySingleton singleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (singleton==null){   //第一次判断是为了防止反复拿到锁，增加代码运行效率。
            synchronized (LazySingleton.class){
                if (singleton==null)   //第二次判断是为了创建单列过程中，单列安全。此时可需要也可不需要volatile指令重排序。
                    singleton = new LazySingleton();
            }
        }
        return singleton;
    }
}
