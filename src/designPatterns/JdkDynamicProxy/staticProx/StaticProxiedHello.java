package designPatterns.JdkDynamicProxy.staticProx;

import java.util.logging.Logger;
/**
 * @author non
 * @version 1.0
 * @date 2019/9/11 9:18
 */
/*静态代理类StaticProxiedHello作为HelloImp的代理，实现相同的Hello接口。*/
public class StaticProxiedHello implements Hello{
    Logger logger =  Logger.getLogger("text");
        private Hello hello = new HelloImp();

        @Override
        public String sayHello(String str) {
            logger.info("You said: " + str);
            return hello.sayHello(str);
        }
}
