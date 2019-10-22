package accumulate.yitu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/11 20:17
 */
public class M5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        Arrays.sort(arr1);

        int falg = 1;
        arr2[0] = falg;
        for (int i = 0; i < n; i++) {
            int temp = 2 * arr1[i];
            for (int j = i; j < n; j++) {
                if (arr1[j]>=temp && arr2[j]==0){
                    arr2[j] = falg;
                    temp = 2 * temp;
                }
            }
            falg++;
        }

        int max = 0;
        int cout  = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]==0)
                cout++;
            max = Math.max(max,arr2[i]);
        }
        System.out.println(max+cout);
    }
}

