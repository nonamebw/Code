package leetcode.string;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/7 17:46
 */
//最长回文子串，中心扩展法
public class LongestPalindrome {

    public static void main(String[] args) {
        String str = "a";
        System.out.println(longestPalindrome(str));
    }
    public static String longestPalindrome(String s) {
        String max = "";
        for(int i=0;i<s.length();++i){
            String str1 = maxSubPalindromic(s,i,i); //奇数中心扩张
            String str2 = maxSubPalindromic(s,i,i+1); //偶数中心扩张
            System.out.print(str2);
            System.out.println(1);
            if(str1.length()>max.length()) max = str1;
            if(str2.length()>max.length()) max = str2;
        }
        return max;
    }

    public static String maxSubPalindromic(String str,int i,int j){
        //这个for循环使用了形参作为边界控制条件
        for(;i>=0 && j<str.length();--i,++j){
            if(str.charAt(i) != str.charAt(j)) break;
        }
        return str.substring(i+1,j); //str.substring(4,4)会得到空串
                                     //str.substring(str.length(),str.length());不会报错，得到空串
    }
}
