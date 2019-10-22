package accumulate.pdd2;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/25 16:06
 */
public class M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //a最多有n个
        int m = scanner.nextInt();  //b最多有m个
        long k = scanner.nextLong();
        long maxi = 1<<58;
        long[][] f = new long[n+1][m+1];
        long[][] s = new long[n+1][m+1];
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= m; j++) {
                s[i][j] = 0;
                if (i==0 && j==0){
                    f[i][j] = 1;
                    s[i][j] = 1;
                }else if (i==0){
                    f[i][j] = f[i][j-1];
                    s[i][j] = s[i][j-1] + 1;
                    }else if (j==0){
                    f[i][j] = f[i-1][j];
                    s[i][j] = s[i-1][j]+1;
                }else {
                    f[i][j] = f[i-1][j] + f[i][j-1];
                    s[i][j] = s[i-1][j] + s[i][j-1] +1;
                    f[i][j] = Math.min(f[i][j],maxi);
                    s[i][j] = Math.min(s[i][j],maxi);
                }
            }
        }
        StringBuilder ans = new StringBuilder("");
        while (k>0){
            if (k==1){
                if (n>0)
                    ans.append('a');
                else
                    ans.append('b');
                break;
            }
            if (n>0 && s[n-1][m] >=k){
                ans.append('a');
                n--;
                k--;
            }else {
                ans.append('b');
                if(n>0){
                    k -= s[n-1][m];
                }
                m--;
                k--;
            }
        }
        System.out.println(ans);
    }
}
