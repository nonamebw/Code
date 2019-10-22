package concurrency.multiThreadCase.chapter1.shareObject;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 9:36
 */
public class BLogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("b","bb");
    }
}
