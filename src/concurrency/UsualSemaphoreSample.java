package concurrency;

import java.util.concurrent.Semaphore;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/21 9:01
 */
/*Java 提供了经典信号量（Semaphore)）的实现，它通过控制一定数量的允许（permit）的方式，
        来达到限制通用资源访问的目的。你可以想象一下这个场景，在车站、机场等出租车时，当很多空出租车就位时，
        为防止过度拥挤，调度员指挥排队等待坐车的队伍一次进来量5 个人上车，等这 5 个人坐车出发，再放进去下一批，
        这和 Semaphore 的工作原理有些类似。*/
public class UsualSemaphoreSample {
    public static void main(String[] args) {
        System.out.println("Action....GO!");
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 10; i++) {
            //只有5个线程能拿到执行权
            Thread t = new Thread(new SemaphoreWorker(semaphore));
            t.start();
        }
    }
}

class SemaphoreWorker implements Runnable{
    private String name;
    private Semaphore semaphore;
    public SemaphoreWorker(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    public void run(){
        try {
            log("is waiting for a permit!");
            //只有5个线程能拿到执行权
            semaphore.acquire();
            log("acquired a permit!");
            log("executed!");
        }catch (InterruptedException e){
            log("released a permit!");
            semaphore.release();
        }
    }

    private void log(String msg){
        if (name == null){
            name = Thread.currentThread().getName();
        }
        System.out.println(name+" "+msg);
    }
}
