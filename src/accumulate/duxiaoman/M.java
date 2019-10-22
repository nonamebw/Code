package accumulate.duxiaoman;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/21 17:29
 */
public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            score(temp);
        }
    }
    private static void score(int N){
        int result = 0;
        int count = 0;
        for (int i = 1; i <=N-1; i++) {
            for (int j = i+1; j <=N; j++) {
                String res = huzi(i,j);
                if (res=="Y"){
                    result = result + i*j;
                }
                count++;
            }
        }
        System.out.println(result+"/"+count);
    }

    private static String huzi(int a, int b){
        if (a<b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        int c = 0;
        while ((c=a%b) !=0){
            a = b;
            b = c;
        }
        if (b==1)
            return "Y";
        else
            return "N";
    }
}
