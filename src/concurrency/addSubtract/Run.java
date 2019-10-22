package concurrency.addSubtract;

import javax.swing.tree.TreeNode;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/19 23:10
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        AddSubtract addSubtract = new AddSubtract();
        Thread a = new Thread(addSubtract,"A");
        Thread b = new Thread(addSubtract,"B");
        Thread c = new Thread(addSubtract,"C");
        Thread d = new Thread(addSubtract,"D");
        a.start();
        a.join(); //主线程停留在这里，等待a线程执行完毕
        b.start();
        b.join();
        c.start();
        c.join();
        d.start();
    }
}
