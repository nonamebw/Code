package concurrency.multiThreadCase.chapter1.shareObject;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 9:38
 */
public class Run {
    public static void main(String[] args) {
        //这两个变量共享了同一个对象
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
