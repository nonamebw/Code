package accumulate.duxiaoman;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/29 19:48
 */
public class M22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] weight = new int[n];
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            time[i] = scanner.nextInt();
        }

        int minTime = 0;
        int actualWeight = weight[0];
        int i = 0;
       while (n>0){

           while (actualWeight + weight[i+1]<m) {
               actualWeight = actualWeight + weight[i + 1];
               n--;
               i++;
           }
           minTime++;
       }
    }
}
