package accumulate;

import java.util.Arrays;
import java.util.Scanner;

public class MM2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int[] b = new int[a];
        for (int i=0; i<a; ++i){
            b[i] = scanner.nextInt();
        }

        for (int i=0; i<a; ++i){

        }
        Arrays.sort(b);
        for (int j : b){
            System.out.print(j + " ");
        }
        int[] c = {1,0};

    }
}
