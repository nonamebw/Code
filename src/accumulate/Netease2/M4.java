package accumulate.Netease2;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/21 16:18
 */
public class M4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long[] cc = new long[n+1];
        long[] ss = new long[n+1];
        long ans = 0;
        for (int i = n-1; i>=0; i--) {
            long count = get(arr[i]-1,cc);
            long tot = get(arr[i]-1,ss);
            ans += tot - count*i;
            add(arr[i],1,cc);
            add(arr[i],i,ss);
        }
        System.out.println(ans);
    }

    private static long get(int cur,long[] arr){
        long res = 0;
        while (cur != 0){
            res += arr[cur];
            cur -= cur & (-cur);
        }
        return res;
    }

    private static void add(int cur, long x,long[] arr){
        int n = arr.length;
        while (cur<n){
            arr[cur] += x;
            cur += cur&(-cur);
        }
    }
}
