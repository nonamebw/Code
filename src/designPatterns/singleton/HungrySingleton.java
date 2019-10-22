package designPatterns.singleton;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/18 11:21
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
