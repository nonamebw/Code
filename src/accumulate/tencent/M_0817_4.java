package accumulate.tencent;

import java.util.Scanner;

public class M_0817_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] reslut = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i <= n-2; i++) {
            int count = 3;
            int right = arr[i+1];
            int left  = arr[i-1];


            for (int j = i+1; j <= n-1; j++) {
                if (arr[j]>right){
                    count++;
                    right = arr[j];
                }
            }

            for (int j = i-1; j > 0; j--) {
                if (arr[j-1] > left){
                    count++;
                    left = arr[j];
                }
            }
            reslut[i] = count;
        }

        for (int i : reslut) {
            System.out.print(i+" ");
        }
    }
}
