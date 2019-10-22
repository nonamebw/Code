package concurrency.multiThreadCase.chapter1.currentThread;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 10:00
 */
public class MyThread extends Thread{
    public MyThread(){
        System.out.println("构造方法打印"+ Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run方法打印"+ Thread.currentThread().getName() );
    }
}
