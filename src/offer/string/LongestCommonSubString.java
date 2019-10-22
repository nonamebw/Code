package offer.string;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/12 20:58
 */
/*最长公共子串（Longest Common Substring）： 是指两个字符串中最长连续相同的子串长度。
        例如：str1=“1AB2345CD”,str2=”12345EF”,则str1，str2的最长公共子串为2345。
        计算dp[i][j] 的方法如下：
        矩阵 dp 的第一列 dp[0…m-1][0].对于 某个位置（i，0）如果str1[i]==str2[0],则dp[i][0]=1,否则dp[i][0]=0
        矩阵 dp 的第一行 dp[0][0…n-1].对于 某个位置（0，j）如果str1[0]==str2[j],则dp[0][j]=1,否则dp[0][j]=0
        其他位置从左到右从上到下计算，dp[i][j]的值只有两种情况：
        1). str1[i]==str2[j],dp[i][j]=dp[i-1][j-1]+1;
        2). str1[i]!=str2[j]则dp[i][j]=0;*/
public class LongestCommonSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        char[] chars2 = scanner.nextLine().toCharArray();
        longestCommonSubString(chars,chars2);
    }
    private static void longestCommonSubString(char[] str, char[] str2){
        int[][] dp = new int[str.length][str2.length];
        for (int i = 0; i < str.length; i++) {  //初始化第一列
            if (dp[i][0] == str2[0])
                dp[i][0] = 1;
            else 
                dp[i][0] = 0;
        }
        for (int j = 0; j < str2.length; j++) { //初始化第一行
            if (dp[0][j]==str[0])
                dp[0][j] = 1;
            else
                dp[0][j] = 0;
        }


        for (int i = 1; i < str.length; i++) {
            for (int j = 1; j < str2.length; j++) {
                if (str[i]==str2[j])
                    dp[i][j] = dp[i - 1][j - 1] + 1; //dp状态转移方程，矩阵斜线字符相等，就在原来斜着基础上加一
                else
                    dp[i][j] = 0;
            }
        }

        int max = 0;
        int index = -1;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (dp[i][j]>max){
                    max = dp[i][j];
                    index = i;
                }
            }
        }
        System.out.println("最长字串长度为"+max);
        String resSubString = "";
        for (int i = index; i >= index - max + 1; i--) {
            resSubString = resSubString + str[i];
        }
        System.out.println("最长字串为："+resSubString);
    }
}
