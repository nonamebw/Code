package designPatterns.JdkDynamicProxy.staticProx;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/11 9:24
 */
public class HelloImp implements Hello {
    @Override
    public String sayHello(String str) {
        return "HelloImp: " + str;
    }
}
