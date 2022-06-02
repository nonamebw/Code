package code2205;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/10
 */
public class Main {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        System.out.println("Hello World!");
    }


    /**
     * 实现该方法
     */
    public static String change(String str) {

        if (str == null || str.length() ==0 || str.length() == 1) {
            return null;
        }

        int first =  str.charAt(0) - '0';
        int second = str.charAt(1) - '0';
        if (str.length() == 2 || first > second) {
            return null;
        }

        for (int i = 0; i < str.length(); i++) {

        }

        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i) - '0';

        }
        return null;
    }
}