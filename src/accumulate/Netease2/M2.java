package accumulate.Netease2;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/21 15:54
 */
public class M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int temp = B - A;
            int ans = (temp + p-1)/p;
            for (int j = 1; j < ans; j++) {
                if (p+A>=B){
                    ans = j;
                    break;
                }
                if((temp + p - 1)/p<=q){
                    p = temp;
                }else {
                    p = p *q;
                }
            }
            System.out.println(ans);
        }
    }
}
