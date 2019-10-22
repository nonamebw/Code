package concurrency.multiThreadCase.chapter3.productConsumer;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 11:18
 */
public class CThread extends Thread{
    private Consumer consumer;
    public CThread(Consumer consumer){
        super();
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true){
            consumer.popService();
        }
    }
}
