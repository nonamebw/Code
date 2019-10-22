package leetcode.string;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/17 9:50
 */
/*   输入一串数字，输出这串数字最多有多少种解码方式
        'A' -> 1
        'B' -> 2
        ...
        'Z' -> 26
                Input: "226"
                Output: 3
                Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
                */
public class DecodeWays {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int[] memo = new int[n+1];   //数组保存每一步的结果
        memo[n]  = 1;
        memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;

        for (int i = n - 2; i >= 0; i--)
            if (s.charAt(i) == '0') continue;
            else
                //只有存在在10 - 26的数，解码的次数整体分类才会增加1个。
                memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];

        return memo[0];
    }
}
