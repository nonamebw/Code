package accumulate.didi;

import java.util.Scanner;
/*
算式转移，字典序最小
*/
public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        char[] a = new  char[n-1];
        char[] b = new char[n-1];
        for (int i = 1; i < (2*n - 1); i = i+2) {
            if (s.charAt(i)=='*'){

            }
            if (s.charAt(i)=='/'){

            }
        }
    }

/*
    public static void chang(String s, int i, int j){
        char temp = s.charAt(i);
        s.replace(s.charAt(i),s.charAt(j));
        s.replace(s.charAt(j),temp);
    }
*/
}
