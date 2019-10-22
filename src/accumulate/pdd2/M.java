package accumulate.pdd2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/25 14:59
 */
public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans += (a[i]*a[2*m-1-i]);
        }
        System.out.println(ans);
    }
}
