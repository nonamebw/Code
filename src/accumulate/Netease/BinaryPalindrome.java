package accumulate.Netease;

import java.util.Scanner;


public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            String temp = Integer.toBinaryString(arr[i]); //十进制数字转换成二进制字符串
            change(temp);
        }
    }

    public static void change(String str){
        String res = new StringBuilder(str).reverse().toString();//又返回值，说明原str没有被更改
        if (str.equals(res))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
