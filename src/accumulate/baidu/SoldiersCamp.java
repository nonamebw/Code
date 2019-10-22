package accumulate.baidu;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/10 22:10
 */
//将一个数n，按照左右孩子等差为k的分法向下分，问这样得到的二叉树叶子结点的个数
public class SoldiersCamp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solve(n,k));
    }
    private static int solve(int n,int k){
        if((n-k)%2 != 0 || n<=k){  //n,k必须同奇同偶，不然无法分堆。即n-k是偶数
            return 1;
        }else{
            return solve((n-k)/2,k) + solve((n+k)/2,k);// (n-k)/2和(n+k)/2 左右划分
        }
    }
}
