package accumulate.pdd;
/*给定一个长度为偶数的数组arr，将该数组中的数字两两配对并求和，在这些和中选出最大和最小值，
        请问该如何两两配对，才能让最大值和最小值的差值最小？
        输入描述:
        一共2行输入。
        第一行为一个整数n，2<=n<=10000, 第二行为n个数，组成目标数组，每个数大于等于2，小于等于100。
        输入
        4
        2 6 4 3*/
import java.util.Arrays;
import java.util.Scanner;

public class Solution_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);    //先对读进来的数组进行自然升序排列
        int[] sum = new int[n/2];
        for(int i = 0; i < n/2; i++) {
            sum[i] = arr[i] + arr[n-1-i];  //然后进行首位相加得到两两配对的和
        }
        Arrays.sort(sum);  //再将存放两个数和的数组进行升序或者降序都行（）
        int min = Math.abs(sum[0] - sum[n/2- 1]);
        System.out.println(min);
    }
}
