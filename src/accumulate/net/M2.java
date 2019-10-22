package accumulate.net;

import java.util.Scanner;

public class M2 {
    static char[] dict = {'A', 'S', 'D', 'F', 'G', 'H'};
    static int[][] arr = new int[720][6];
    static int arrLen = 0;
    static void dfs(int now, int[] a) {
        if (now == 6) {
            for (int i = 0; i < 6; i++) {
                arr[arrLen][i] = a[i];
            }
            arrLen++;
//   System.out.println(arrLen);
            return;
        }
        for (int i = 0; i < 6; i++) {
            boolean found = false;
            for (int pre = 0; pre < now; pre++) {
                if (a[pre] == i) {
                    found = true;
                    break;
                }
            }
            if (found) continue;
            a[now] = i;
            dfs(now + 1, a);
        }
    }
    public static void main(String[] args) {
        dfs(0, new int[6]);
        Scanner in = new Scanner(System.in);
        int ttt = in.nextInt();
        while (ttt-- > 0) {
            String text = in.next();
            int ans = -1;
            for (int i = 0; i < arr.length; i++) {
                int res = 0;
                int pre = -1;
                for (int j = 0; j < text.length(); j++) {
                    char c = text.charAt(j);
                    int k = -1;
                    switch (c) {
                        case 'A':
                            k = 0;
                            break;
                        case 'S':
                            k = 1;
                            break;
                        case 'D':
                            k = 2;
                            break;
                        case 'F':
                            k = 3;
                            break;
                        case 'G':
                            k = 4;
                            break;
                        case 'H':
                            k = 5;
                            break;
                    }
                    if (pre != -1) {
                        res += Math.abs(arr[i][pre] - arr[i][k]);
                    }
                    pre = k;
                }
                if (ans == -1 || res < ans) {
//           for (int j = 0; j < 6; j++) {
//            System.out.print(arr[i][j] + " ");
//           }
//           System.out.println();
                    ans = res;
                }
            }
            System.out.println(ans);
        }
    }
}
