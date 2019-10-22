package accumulate.webank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/19 16:39
 */
public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger res = new BigInteger("1");
        while (n>0){
            res = res.multiply(BigInteger.valueOf(n));
            n -= 1;
        }

        String str = res + "";
        for (int i = str.length()-1; i>=0; i--) {
            if (str.charAt(i) != '0'){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
