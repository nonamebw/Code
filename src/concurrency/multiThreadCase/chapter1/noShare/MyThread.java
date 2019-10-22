package concurrency.multiThreadCase.chapter1.noShare;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 9:17
 */
public class MyThread extends Thread {  //继承Thread不一定要重写run方法
    private int count  = 5;
    public MyThread(String name){
        super();
        this.setName(name); //父类的方法
    }

    @Override
    public void run(){
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+ this.currentThread().getName() + "计算，count="+ count);
        }
    }
}
