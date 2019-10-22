package concurrency.multiThreadCase.chapter3.productConsumer;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 11:18
 */
public class PThread extends Thread{
    private Provider provider;
    public PThread(Provider provider){
        super();
        this.provider = provider;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            provider.pushService();
        }
    }
}
