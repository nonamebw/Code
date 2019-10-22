package accumulate.pdd2;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/25 15:22
 */
public class M4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ttt = scanner.nextInt();
        for (int tt = 1; tt <= ttt; tt++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] w = new int[m];
            int[] c = new int[m];
            for (int i = 0; i < m; i++) {
                w[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                c[i] = scanner.nextInt();
            }
            int k = 0;
            long[] f = new long[4];
            for (int j = 0; j < 4; j++) {
                if (m>0 && w[0]==1){
                    if (j==c[0]-1){
                        f[j]=1;
                    }else {
                        f[j]=0;
                    }
                }else {
                    f[j] = 1;
                }
            }
            long[] nf = new long[4];
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < 4; j++) {
                    nf[j] = 0;
                }
                if (k<m && i==w[k]){
                    for (int j = 0; j < 4; j++) {
                        if (j!=c[k]-1){
                            nf[c[k]-1] += f[j];
                        }
                    }
                    k++;
                }else {
                    for (int j = 0; j < 4; j++) {
                        for (int g = 0; g < 4; g++) {
                            if (g !=j){
                                nf[j] += f[j];
                            }
                        }
                    }
                }
                for (int j = 0; j < 4; j++) {
                    f[j] = nf[j] % 1000000007;
                }
            }
            long ans = 0;
            for (int i = 0; i < 4; i++) {
                ans += f[i];
            }
            System.out.println(ans % 1000000007);
        }
    }
}
