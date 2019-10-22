package accumulate.zhaoying;

import java.util.Arrays;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/9 15:12
 */
public class BubbleSort {
    private static void bubbleSort(int[] arr){
        for (int i = arr.length - 1; i >=1; i--) {   //  1=<i<=len-1 做条件控制
            for (int j = 0; j <= i-1; j++) {         //  0=<j<=len-2
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,21,19,-3,89,45};
        bubbleSort(arr);
    }
}
