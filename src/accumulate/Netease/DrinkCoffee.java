package accumulate.Netease;

import java.util.Scanner;

/*喝咖啡
一个月30天，m天的时候为了庆祝可以喝咖啡
其余时间要大于等于k天才能喝咖啡，问一个月最多喝咖啡的天数*/
public class DrinkCoffee {
    private static final byte TEST = 0;
    private static final String INPUT =
            "4\n"  //4组测试用例
                    + "0 10\n"   // k=0 m=10
                    + "1 2 3 4 5 6 7 8 9 10\n"  //m=10的具体的日子
                    + "1 15\n"
                    + "1 3 5 7 9 11 13 15 17 19 21 23 25 27 29\n"
                    + "1 7\n"
                    + "5 9 13 17 21 25 29\n"
                    + "1 0\n"
                    + "\n";

    public static void main(String[] args) {
        Scanner scanner = TEST == 1 ? new Scanner(INPUT) : new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();
            int m = scanner.nextInt();
            int[] num = new int[m + 1];
            num[m] = 31 + k;
            for (int j = 0; j < m; j++) {
                num[j] = scanner.nextInt();
            }
            System.out.println(solve(k, m, num));
        }
        scanner.close();
    }

    private static int solve(int k, int m, int[] num) {
        int count = m;
        int cur = 1;
        for (int i = 0; i <= m; i++) {
            if (cur <= num[i]) {

                int tmp = (num[i] - cur) / (k + 1);
                cur = num[i] + k + 1;
                count += tmp;
            } else if (cur > 30) {
                break;
            }
        }
        return count;
    }
}
