package concurrency.multiThreadCase.chapter3.productConsumer;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 11:30
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Provider p1 = new Provider(myStack);
        Provider p2 = new Provider(myStack);
        Provider p3 = new Provider(myStack);
        PThread pThread1 = new PThread(p1);
        PThread pThread2 = new PThread(p2);
        PThread pThread3 = new PThread(p3);
        pThread1.start();
        pThread2.start();
        pThread3.start();

        Consumer c1 = new Consumer(myStack);
        Consumer c2 = new Consumer(myStack);
        Consumer c3 = new Consumer(myStack);
        CThread cThread1 = new CThread(c1);
        CThread cThread2 = new CThread(c2);
        CThread cThread3 = new CThread(c3);
        cThread1.start();
        cThread2.start();
        cThread3.start();

    }
}
