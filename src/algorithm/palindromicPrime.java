package algorithm;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/26 22:17
 */
public class palindromicPrime {
    public static void main(String[] args) {
        isPalindrom(377873);
    }

    private static void isPalindrom(int num){
        String res = "" + String.valueOf(num);
        int start = 0;
        int end = res.length()-1;
        while (start<end){
            if( res.charAt(start) != res.charAt(end)){
                System.out.println("NO!");
                return;
            }
            ++start;
            --end;
        }
        System.out.println("YES!");
    }

    private static void isPrime(int num){
        int count = 0;
        for (int i = 1;i<=num; i++) {
            if (num%i==0)
                ++count;
        }

        if (count==2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
