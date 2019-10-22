package algorithm.dp;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/26 11:32
 */
/*动态规划  状态及状态转移方程
数塔取数问题
        一个高度为N的由正整数组成的三角形，从上走到下，求经过的数字和的最大值。
        每次只能走到下一层相邻的数上，例如从第3层的6向下走，只能走到第4层的2或9上。
        该三角形第n层有n个数字，例如：
        第一层有一个数字：5
        第二层有两个数字：8 4
        第三层有三个数字：3 6 9
        第四层有四个数字：7 2 9 5
        最优方案是：5 + 8 + 6 + 9 = 28
        注意:上面应该是排列成一个三角形的样子不是竖向对应的，排版问题没有显示成三角形。*/
public class DP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//数塔规模大小，用n*n矩阵抽象表示
        int[][] dp = new int[n][n]; //dp中始终记录着到每个位置的最大值。
        dp[0][0] = scanner.nextInt();//开始时的值
        int max = Integer.MIN_VALUE;
        for (int i=1; i<n; ++i){
            for (int j=0; j<=i; ++j){
                int num = scanner.nextInt();
                if (j==0){
                    dp[i][j] = dp[i-1][j] + num;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j]) + num;
                }
                max = Math.max(dp[i][j],max);

            }
        }
        System.out.println(max);
    }
}
