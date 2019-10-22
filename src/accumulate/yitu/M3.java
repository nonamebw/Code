package accumulate.yitu;

import java.util.*;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/11 19:00
 */
public class M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> vol = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vol.add(scanner.nextInt());
        }
        Collections.sort(vol);
        int i = vol.size()-1;
        int temp = vol.get(i)/2;
        int j = vol.size()-2;
        for ( ; j>=0; --j) {
            if (vol.get(j)<=temp) {
                vol.remove(i);
                i = vol.size() - 1;
                temp = vol.get(i)/2;
                j = i - 1;
            }
        }
        System.out.println(vol.size());
    }
}
