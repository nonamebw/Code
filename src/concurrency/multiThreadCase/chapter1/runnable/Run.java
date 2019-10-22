package concurrency.multiThreadCase.chapter1.runnable;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 8:55
 */
public class Run {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();  //实现Runnable接口的类，是不可以直接Run的。
        Thread thread = new Thread(runnable);  //把实现Runnable类的对象，传递给Thread类。
        thread.start();
        System.out.println("运行结束！");
    }
}
