package accumulate.webank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/19 16:58
 */
public class M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int mod = 1000003;
        BigInteger res = new BigInteger("1");
        while (x>0){
            res = res.multiply(BigInteger.valueOf(x));
            x -= 1;
        }

        BigInteger moderns= new BigInteger(String.valueOf(mod));
        System.out.println(res.modInverse(moderns));
    }
}
