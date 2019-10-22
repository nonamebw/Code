package accumulate;


import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[100];
        int[] y = new int[100];
        while (scanner.hasNext()){
            String a = scanner.nextLine();
            String[] b = a.split(" ");
            for(int i=0;i<b.length;++i){
                x[i] = Integer.parseInt(b[i]);
            }
        }

    }
}
