package accumulate.bytedance;

import java.util.Scanner;

/*用户喜好
        输入描述:
        输入： 第1行为n代表用户的个数 第2行为n个整数，第i个代表用户标号为i的用户对某类文章的喜好度 第3行为一个正整数q
        代表查询的组数  第4行到第（3+q）行，每行包含3个整数l,r,k代表一组查询，即标号为l<=i<=r的用户中对这类文章喜好值为k
        的用户的个数。 数据范围n <= 300000,q<=300000 k是整型
        输出描述:
        输出：一共q行，每行一个整数代表喜好值为k的用户的个数
        输入例子1:
        5
        1 2 3 3 5
        3
        1 2 1
        2 4 5
        3 5 3
        输出例子1:
        1
        0
        2
        例子说明1:
        样例解释:
        有5个用户，喜好值为分别为1、2、3、3、5，
        第一组询问对于标号[1,2]的用户喜好值为1的用户的个数是1
        第二组询问对于标号[2,4]的用户喜好值为5的用户的个数是0
        第三组询问对于标号[3,5]的用户喜好值为3的用户的个数是2*/
public class UserLikeArticle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] fun = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            fun[i] = scanner.nextInt();
        }
        int q  = scanner.nextInt();
        int[][] query = new int[q+1][4];
        for (int i = 1; i < q+1; i++) {
            for (int j = 1; j < 4; j++) {
                query[i][j] = scanner.nextInt();
            }

        }

        for (int i = 1; i <q+1; i++) {
            int count = 0;
            for (int k = query[i][1]; k <= query[i][2]; k++) {
//                System.out.println("query[i][1]="+query[i][1] + "~ query[i][2]"+ query[i][2] );
//                System.out.println("fun[k]="+fun[k]);
                if(fun[k]==query[i][3]){
//                    System.out.println("query[i][3]="+query[i][3]);
                    ++count;
                }

            }
            System.out.println(count);
        }
    }
}
