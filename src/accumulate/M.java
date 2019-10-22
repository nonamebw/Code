package accumulate;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/28 20:27
 */
class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lists.add(scanner.nextLine());
        }
        int[] scort = new int[m];
        for (int i = 0; i < m; i++) {
            scort[i] = scanner.nextInt();
        }

        int maxScore = 0;
        for (int i = 0; i < m; i++) {
            int[] res = new int[5];
            for (int j = 0; j < n; j++) {
                String temp = lists.get(j);
                res[temp.charAt(i)- 'A']++;
            }
            int maxIndex = 0;
            for (int k=1; k<5;k++){
                if (res[k]>res[k-1])
                    maxIndex = k;
            }
            maxScore = maxScore + res[maxIndex]*scort[i];
        }

        System.out.println(maxScore);
    }

}
