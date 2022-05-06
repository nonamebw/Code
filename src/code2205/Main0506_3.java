package code2205;

import java.util.Collections;
import java.util.Scanner;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/6
 */
public class Main0506_3 {

    public static int[] get(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int temp  = scanner.nextInt();
            arr[i] = temp;
        }
        int[] goal = get(arr);
        int temp = goal[0];
        System.out.println(temp);
        for (int i = 1; i < goal.length; i++) {
            if (temp == goal[i]){
                continue;
            }
            temp = goal[i];
            System.out.println(goal[i]);
        }
    }
}
