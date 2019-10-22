/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] qq = sc.nextLine().split(" ");
            int Nn = Integer.valueOf(qq[0]);
            int V = Integer.valueOf(qq[1]);

            int[] cccost = new int[Nn];//w
            int[] vvvalue = new int[Nn];//v
            int[] nnnumber = new int[Nn];//
            for (int i = 0; i < Nn; i++) {
                String[] ss = sc.nextLine().split(" ");
                cccost[i] = Integer.valueOf(ss[0]);
                vvvalue[i] = Integer.valueOf(ss[1]);
                nnnumber[i] = Integer.valueOf(ss[2]);
            }
            pack(vvvalue, cccost, nnnumber, Nn, V);
        }
    }

    public static void pack(int[] v, int[] w, int[] t, int n, int V) {
        int[] dddp = new int[V+1];

        for (int i = 1; i <= V; i++) {
            dddp[i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = V; j >= w[i-1]; j--) {
                int cccount = Math.min(t[i-1], j/w[i-1]);
                int tmpe = 0;
                for (int k = 0; k <= cccount; k++) {
                    if (dddp[j - w[i-1]*k] + v[i-1]*k > tmpe) {
                        tmpe = dddp[j-w[i-1]*k] + v[i-1]*k;
                    }
                }
                dddp[j] = Math.max(dddp[j], tmpe);
            }
        }

        System.out.println(dddp[V]);
    }
}*/
