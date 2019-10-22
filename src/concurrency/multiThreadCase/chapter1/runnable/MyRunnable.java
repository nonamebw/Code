package concurrency.multiThreadCase.chapter1.runnable;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 8:54
 */
public class MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("运行中");
    }
}
