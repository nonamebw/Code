package designPatterns.JdkDynamicProxy;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/11 8:17
 */
public class HelloImpl implements IHello {
    @Override
    public void sayHello(){
        System.out.println("Hello JdkDynamicProxy!");
    }
}
