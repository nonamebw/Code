package concurrency.multiThreadCase.chapter1.noShare;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 9:22
 */
public class Run {
    public static void main(String[] args) {
        // a,b线程只是基于同一个类创建的两个线程对象，没有共享数据资源，不存在线程安全问题。
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        a.start();
        b.start();
    }
}
