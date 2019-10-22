package tool;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/26 11:28
 */
public class ScannerDemo2 {
    public static void main(java.lang.String[] args) {
        test_1();
    }

    public static void test_1(){
        //第一行取一个数字
        //第二行读取一整行
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        scanner.nextLine();
        java.lang.String b = scanner.nextLine();
        System.out.println(b);
    }

    public static void test_2(){
        //有且只能读取第一行    4      (空格)          jasldfjasldfjasl
        //输出 a = 4; b = jasldfjasldfjasl;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        scanner.nextLine();
        java.lang.String b = scanner.nextLine();
        System.out.println(b);
    }
}
