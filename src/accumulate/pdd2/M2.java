package accumulate.pdd2;

import java.util.BitSet;
import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/25 15:15
 */
public class M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BitSet set = new BitSet(n);
        int res = 0;
        for (int i = 0; i < m; i++) {
            if (res!=n){
                int left = scanner.nextInt();
                int right = scanner.nextInt();
                for (int j = left; j <=right; j++) {
                    if (!set.get(j)){
                        set.set(j);
                        res++;
                    }
                }
                System.out.println(res);
            }else
                System.out.println(res);
        }
    }
}
