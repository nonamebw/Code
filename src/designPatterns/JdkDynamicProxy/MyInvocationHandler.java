package designPatterns.JdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/11 8:20
 */
/*使用JDK动态代理的五大步骤：
        1）通过实现InvocationHandler接口来自定义自己的InvocationHandler；
        2）通过Proxy.getProxyClass获得动态代理类；
        3）通过反射机制获得代理类的构造方法，方法签名为getConstructor(InvocationHandler.class)；
        4）通过构造函数获得代理对象并将自定义的InvocationHandler实例对象传为参数传入；
        5）通过代理对象调用目标方法；*/

public class MyInvocationHandler implements InvocationHandler {
    private Object target;  //目标对象
    public MyInvocationHandler(Object target){ //构造方法名和类名应一致
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable{
        System.out.println("------插入前置通知代码---------");
        Object res = method.invoke(target,args);
        System.out.println("------插入后置处理代码---------");
        return res;
    }
}
