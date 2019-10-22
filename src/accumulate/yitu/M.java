package accumulate.yitu;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/11 19:00
 */
public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int money = scanner.nextInt();
        int[][] house = new int[n][3]; //area, dis, price
        int[][] car = new int[m][2];  //speed price
//        int minHouse  = Integer.MAX_VALUE;
        int minCar = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                house[i][j] = scanner.nextInt();
//                minHouse = Math.min(minHouse,house[i][2]);
            }
        }
        for (int i = 0; i<m; i++) {
            for (int j = 0; j < 2; j++) {
                car[i][j] = scanner.nextInt();
                minCar = Math.min(minCar,car[i][1]);
            }
        }

        int res = 0;  //10*area - floor(dist/speed);
        for (int i = 0; i < n; i++) {
            int temp = money;
            if (temp-house[i][2]>0){
                temp = temp - house[i][2];
                if (temp < minCar) continue;
                for (int j = 0; j < m; j++) {
                    if (temp>=car[j][1]){
                        int comfortable = 10 * house[i][0] - house[i][1]/car[j][0];
                        res = Math.max(res,comfortable);
                    }
                }
            }
        }

        System.out.println(res);

    }
}
