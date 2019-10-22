package accumulate.cisco;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/23 20:27
 */
public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = 0;
        int j = str.length()-1;
        while (j>0 && str.charAt(j)!='<')
            j--;
        while (i<str.length() && !('a'<= str.charAt(i) ) && str.charAt(i) <='Z' )
            i++;
        System.out.println(str.substring(i,j-i+1));
    }
}
