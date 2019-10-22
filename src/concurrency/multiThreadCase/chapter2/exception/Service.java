package concurrency.multiThreadCase.chapter2.exception;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 10:19
 */
public class Service {
    synchronized public void testMethos(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName = "+ Thread.currentThread().getName()
                    + "    run beginTime = " + System.currentTimeMillis());
            int i = 1;
            while (i==1){
                    System.out.println("ThreadName = "
                            + Thread.currentThread().getName()
                            + "run exceptionTime="
                            + System.currentTimeMillis());
                    Integer.parseInt("a"); //会有异常
            }
        }else {
            System.out.println("Thread B run Time = " + System.currentTimeMillis());
        }
    }
}
