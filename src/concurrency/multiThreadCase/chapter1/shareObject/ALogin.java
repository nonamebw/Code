package concurrency.multiThreadCase.chapter1.shareObject;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 9:33
 */
public class ALogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
