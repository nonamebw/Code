package accumulate.tencent;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/21 21:48
 */
//贪吃的小Q
public class SwallowerQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        getMax(n, M);//找出1到M中的一个值，是第一天吃巧克力的数量。

    }

    // 使用二分法进行判断
    public static void getMax(int outDays, int chocolateNum){

        int left = 1, right = chocolateNum;

        while(left <= right) {
            int mid = (left + right) / 2;

            boolean enough = true;      // 用于记录巧克力的数量是否足够，不足时需要减少第一天吃的数量，充足则增大第一天吃的数量
            int remain = chocolateNum;      // 剩余的巧克力的数量
            int eat = mid;          // 第一天吃的巧克力的数量

            for (int i = 0; i < outDays; i ++) {
                if (remain < eat) {
                    enough = false;
                    break;
                }
                remain -= eat;      // 巧克力的剩余量
                eat = (eat+1) / 2;     // 之后需要吃的巧克力的数量，向上取整
            }

            if (enough) {  // 巧克力数量充足，增大第一天吃的数量
                left = mid + 1;
            } else {    // 巧克力数量不足，需要减少第一天吃的数量，
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
