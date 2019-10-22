package concurrency.multiThreadCase.chapter1.shareObject;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 9:28
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String username,String password){
        try{
            usernameRef = username; //不加锁，后来的线程可以修改这个变量
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username="+usernameRef +"    password="+passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
