package concurrency.multiThreadCase.chapter1.thread;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 8:37
 */
public class MyThread extends Thread{
    private int i;
    public MyThread(int i ){
        super();
        this.i = i;
    }
    @Override
    public void run() {
        super.run();
        System.out.println(i);
    }
}
