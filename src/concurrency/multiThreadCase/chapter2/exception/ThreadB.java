package concurrency.multiThreadCase.chapter2.exception;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 10:27
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethos();
    }
}
