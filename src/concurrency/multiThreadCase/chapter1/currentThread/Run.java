package concurrency.multiThreadCase.chapter1.currentThread;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 10:02
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
        myThread.start();
    }
}
