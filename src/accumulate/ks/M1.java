package accumulate.ks;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/16 21:04
 */
public class M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length()<=16)
            System.out.println("IPv4");
        System.out.println("Neither");
    }
}
