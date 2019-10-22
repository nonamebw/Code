package accumulate;

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String[] c = a.split(" ");
        String[] d = b.split(" ");
        String g = String.valueOf(c);
        String h = String.valueOf(d);


        char[] j = g.toCharArray();
        char[] k = h.toCharArray();
        int[] e = new int[j.length];
        int[] f = new int[k.length];
        for (int i=0; i<j.length;++i){
            e[i] = (int) j[i];
        }
        for (int i=0; i<k.length;++i){
            f[i] = (int) k[i];
        }

        int index = -1;
        for(int i=0;i<e.length-1;++i){
            if(e[i]-e[i+1] >=0 )
                index = i;
        }
        int max = Integer.MIN_VALUE;
        int cout =0;

        for (int i=0;i<f.length;++i){
            if(e[index-1]< f[i] &&  e[index+1] >f[i]){
                max = Math.max(max,f[i]);
                cout++;
            }
        }
        if(cout ==0){
            System.out.println("NO");
        }else {
            e[index] = max;
            for(int i: e){
                System.out.println(i);
            }
        }
    }

   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String[] c = a.split(" ");
        String[] d = b.split(" ");
        int[] e = new int[c.length];
        int[] f = new int[d.length];
        for(int i=0;i<c.length;++i){
            e[i] = Integer.parseInt(c[i]);
        }
        for(int i=0;i<d.length;++i){
            f[i] = Integer.parseInt(d[i]);
        }

        int index = -1;
        for(int i=0; i<e.length; ++i){
            if(e[i]-e[i+1]>=0)
                index = i;
        }
        Arrays.sort(f);
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0; i<f.length; ++i){
            if (index == 0){
                if(f[i]<e[1]){
                    max = Math.max(max,f[i]);
                    count++;
                }

            }else {
                if (e[index-1]<f[i] && e[index+1]>f[i]){
                    max = Math.max(max,f[i]);
                    count++;
                }
            }
        }

        if(count==0){
            System.out.println("NO");
        }else {

            e[index] = max;

            for(int m : e){
                System.out.println(m);
            }
        }
    }*/
}
