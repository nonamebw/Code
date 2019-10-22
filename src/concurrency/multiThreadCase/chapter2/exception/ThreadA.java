package concurrency.multiThreadCase.chapter2.exception;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 10:25
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethos();
    }
}
