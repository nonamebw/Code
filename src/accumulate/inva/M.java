package accumulate.inva;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/16 19:42
 */
public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            char[] temp = scanner.nextLine().toCharArray();
            Arrays.sort(temp);
            String str = String.valueOf(temp);
            set.add(str);
        }
        System.out.println(set.size());
    }
}
