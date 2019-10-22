/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] ss1 = sc.nextLine().split(" ");
            int Nn = Integer.valueOf(ss1[0]);
            int Aa = Integer.valueOf(ss1[1]);
            int Xx= Integer.valueOf(ss1[2]);

            int t = 0;
            int[] but = new int[Nn];
            String[] ss2 = sc.nextLine().split(" ");
            for (int i = 0; i < Nn; i++) {
                but[i] = Integer.valueOf(ss2[i]);
                t += but[i];
            }

            if (t <= Xx*60*Aa) {
                int a = t % Aa;
                t = t/Aa + (a == 0 ? 0 : 1);
            }else {
                t = t - Xx*60*Aa + Xx*60;
            }

            if (t <= 60*8) {
                System.out.println(t);
            }else {
                System.out.println(0);
            }

        }
    }
}*/
