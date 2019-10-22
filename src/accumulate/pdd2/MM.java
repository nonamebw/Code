package accumulate.pdd2;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/25 15:15
 */
public class MM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int res = 0;
        int index = 0;
        for (int i = 1; i <= m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int temp = 0;
            index = end;
            if (start != index)
                temp = end - start + 1;
            else
                temp = end -start;
            res = res + temp;
            System.out.println(res);
        }
    }
}
