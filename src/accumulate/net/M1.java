package accumulate.net;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/27 20:46
 */
public class M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            trans(a,b);
        }
    }

    private static void  trans(int a, int b){
        String temp = String.valueOf(b);
        int[] arr = new int[10];
        for (int i = temp.length()-1; i >=0; i--) {
            int te = a * (int)temp.charAt(i);
            for (int j = 0; j < (te+"").length(); j++) {
                 arr[(int)(te+"").charAt(j)]++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
