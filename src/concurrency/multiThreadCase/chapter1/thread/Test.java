package concurrency.multiThreadCase.chapter1.thread;

import concurrency.multiThreadCase.chapter1.thread.MyThread;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 8:43
 */
public class Test {
    public static void main(String[] args) {
        MyThread th = new MyThread(1);  //继承Thread类，这个类就可以直接Run的。
        MyThread th2 = new MyThread(2);
        MyThread th3 = new MyThread(3);
        MyThread th4 = new MyThread(4);
        MyThread th5 = new MyThread(5);
        th.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
