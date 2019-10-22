package accumulate.net;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/27 21:22
 */
public class Mt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {2,2,2,2,3,3,1,3,1};
        int[] arr2 = {1,1,2,0,1,0,0,0,0};
        int[] arr3 = {2,2,1,0,1,0,0,0,0};
        print(arr1);
        print(arr2);
        print(arr3);
        System.out.println(1);
    }

    private static void print(int[] arr){
        String res = "";
        for (int i : arr) {
            res = res +" "+ i;
        }
        System.out.println(res.trim());
    }
}
