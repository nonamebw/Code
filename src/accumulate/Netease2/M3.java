package accumulate.Netease2;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/21 16:03
 */
public class M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int kk = 0; kk < t; kk++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int ans = 1;
            for (int i = 0; i < n; i++) {
                if (i+ans>=n)
                    break;
                long s = 0;
                for (int j = i; j < n; j++) {
                    if (arr[j]<s) break;
                    s+=arr[j];
                    ans = Math.max(ans,j-i+1);
                }
            }
            System.out.println(ans);
        }
    }
}
