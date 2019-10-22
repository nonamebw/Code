package concurrency.multiThreadCase.chapter2.exception;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 10:32
 */
//线程在运行时发生异常，该线程会释放锁，其它线程来获取
    //线程在运行时sleep()，不会释放锁
public class Test {
    public static void main(String[] args) {
        try{
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
