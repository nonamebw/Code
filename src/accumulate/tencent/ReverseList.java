package accumulate.tencent;

import java.util.Scanner;
/*
        小Q定义了一种数列称为翻转数列:
        给定整数n和m, 满足n能被2m整除。对于一串连续递增整数数列1, 2, 3, 4..., 每隔m个符号翻转一次, 最初符号为'-';。
        例如n = 8, m = 2, 数列就是: -1, -2, +3, +4, -5, -6, +7, +8.
        而n = 4, m = 1, 数列就是: -1, +2, -3, + 4.
        小Q现在希望你能帮他算算前n项和为多少。
                输入描述:
                输入包括两个整数n和m(2 <= n <= 109, 1 <= m), 并且满足n能被2m整除。
*/
/*
思路: 单纯数学规律，从第一个数字开始，每 2m 个数字之和为 m^2，总共有 n/2m 个这样的组合，因此和为 m*n/2
*/
public class ReverseList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(process(n, m));
    }
    public static long process(long n, long m){
        if(n % (2* m) != 0)
            return -1;
        return m * (n / 2);
    }
}
