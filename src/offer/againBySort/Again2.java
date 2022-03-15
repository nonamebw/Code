package offer.againBySort;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/3/15
 *
 * 题目：字符串替换，将字符串中的空格替换为“%20”，例如：We are happy
 */
public class Again2 {

    public static String replaceStr1(String str) {
        return str.replace(" ","%20");
    }

    public static String replaceStr2(String str) {
        return str.replaceAll(" ","\\%20");
    }

    public static String replaceStr3(String str){
        return str.replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        String str = "we are happy";
        System.out.println(replaceStr3(str));
    }
}
