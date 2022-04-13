package leetcode.again;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/4/13
 *
 * 题目：回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 输入：x = 121
 * 输出：true
 */
public class Again9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = 0;
        int temp = x;
        while (x != 0) {
            n = n * 10  +  x % 10;
            x = x/10;
        }
        return n == temp;
    }
}
