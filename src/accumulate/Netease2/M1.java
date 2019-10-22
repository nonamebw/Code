package accumulate.Netease2;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/21 15:38
 */
public class M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            System.out.println(minNum(temp));
        }
    }
    private static String minNum(int num){
        if ( num <=9)
            return num + "";
        String res = "";
        int a = num/9;
        int b = num%9;
        for (int i = 1; i <=a; i++) {
            res = res + "9";
        }
        if (b!=0)
        res = b + res;

        return res;
    }
}
