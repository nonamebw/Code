package algorithm;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 17:43
 */
public class toHexString {
    public static void main(String[] args) {
        method(777);
        System.out.println(Integer.toHexString(777));
    }

    private static void method(int num){
        char[] chars = {'a','b','c','d','e','f'};
        String res = "";
        while (num>0){
            int temp = num%16;  //取余（取模）
            num = num/16;   //取商
            if (temp>=10)
                res = chars[temp-10]+res;
            else
                res = temp + res;
        }
        System.out.println(res);
    }
}
