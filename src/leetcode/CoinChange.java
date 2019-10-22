package leetcode;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/6 21:44
 */
/*最少硬币数问题
* 有很多种类型的硬币，要买一个amount价格的商品
* 最少要带多少枚硬币
* 当硬币只有2、3元数值，要买100元的商品
* 只能用动态规划，不能使用贪心算法。
*
* */
public class CoinChange {
    private static int coinChange(int[] coin, int amount){
        if (coin==null || coin.length==0 || amount<0)
            return 0;
        int[] minNum = new int[amount+1];
        for (int i = 1; i <= amount; i++) {
            minNum[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coin.length; j++) {
                if (coin[j]<=i && minNum[i-coin[j]] != Integer.MAX_VALUE )
                    minNum[i] = Integer.min(minNum[i],1+minNum[i-coin[j]]);
            }
        }
        if (minNum[amount]==Integer.MAX_VALUE)
            return -1;
        else
            return minNum[amount];
    }
}
