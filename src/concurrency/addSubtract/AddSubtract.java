package concurrency.addSubtract;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/19 23:06
 */
public class AddSubtract  extends Thread{
    private int count = 0;

    @Override
    public void run() {
        if (this.currentThread().getName()=="A" || this.currentThread().getName()=="C"){
            count++;
            System.out.println(count);
        }

        if (this.currentThread().getName()=="B" || this.currentThread().getName()=="D"){
            count--;
            System.out.println(count);
        }

    }
}
