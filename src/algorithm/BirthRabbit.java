package algorithm;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/19 20:17
 */
public class BirthRabbit {
    public static void main(String[] args) {
        int n = 20;
        int a = 7;
        int b = 3;
        int[] function = new int[1000];
        function[0] = 0;
        for (int i = 0; i < a; i++) {
            function[i] = 1;
        }
        for (int i = a; i < n; i++) {
            function[i] = function[i-3] + function[i-7];
        }
        System.out.println(function[19]);
    }
}
