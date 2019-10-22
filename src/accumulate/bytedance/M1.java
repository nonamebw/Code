package accumulate.bytedance;

import java.util.Arrays;
import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] colok = new int[n][2];
        int[] trans = new int[n];
        for (int i = 0; i < n; i++) {
            colok[i][0] = scanner.nextInt();
            colok[i][1] = scanner.nextInt();
            trans[i] = colok[i][0]*60 + colok[i][1];
        }
        int time = scanner.nextInt();
        int[][] course = new int[1][2];
        course[0][0] = scanner.nextInt();
        course[0][1] = scanner.nextInt();

        int temp = course[0][0]*60 + course[0][1] - time;
        int max = -1;

        Arrays.sort(trans);

        for (int i = 0; i < n; i++) {
            if (trans[i] <= temp){
                 max = Math.max(max,trans[i]);
            }
        }

        int hour = max / 60;
        int mint = max % 60;
        System.out.println(hour+" "+mint);
    }
}
