package algorithm.sort;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/17 11:27
 */

//选择排序。
// 依次在数组中找出最小、第二小、第三小... 放在数组0,1,2，...的位置
// 最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        if (array.length==0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;   //角标和边界条件同步

            for (int j = i; j < array.length; j++) { //遍历范围逐渐缩小
                if (array[j]<array[minIndex])
                    minIndex = j;
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
