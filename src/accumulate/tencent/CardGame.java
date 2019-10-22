package accumulate.tencent;

import java.util.Arrays;
import java.util.Scanner;

/*纸牌游戏
        牛牛和羊羊正在玩一个纸牌游戏。这个游戏一共有n张纸牌, 第i张纸牌上写着数字ai。
        牛牛和羊羊轮流抽牌, 牛牛先抽, 每次抽牌他们可以从纸牌堆中任意选择一张抽出, 直到纸牌被抽完。
        他们的得分等于他们抽到的纸牌数字总和。
        现在假设牛牛和羊羊都采用最优策略, 请你计算出游戏结束后牛牛得分减去羊羊得分等于多少。
        输入描述:
        输入包括两行。
        第一行包括一个正整数n(1 <= n <= 105),表示纸牌的数量。
        第二行包括n个正整数ai(1 <= ai <= 109),表示每张纸牌上的数字。
        输出描述:
        输出一个整数, 表示游戏结束后牛牛得分减去羊羊得分等于多少。
        输入例子1:
        3
        2 7 4
        输出例子1:
        5*/
public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        long nn = 0;
        long yy = 0;
        boolean falg = true;
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        for (int i = n-1; i >= 0; i--) {
            if (falg){
                nn = nn + num[i];
                falg = false;
            }else {
                yy = yy + num[i];
                falg = true;
            }
        }
        System.out.println(nn-yy);
    }
}
