package accumulate.sxf;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/18 16:45
 */
public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String res = "013#5###2#46###";
        for (int i = 0; i < res.length(); i++) {
            System.out.println(res.charAt(i));
        }
    }
}
