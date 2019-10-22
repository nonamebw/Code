package algorithm.sort;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/17 12:52
 */
//插入排序，
// 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
// 在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间
public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1]; //记录下待插入的值
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) { //待插入的值比已排序列最大值小，才能插入
                array[preIndex + 1] = array[preIndex];  //向后挪位，直到待插入的值找到自己的位置
                preIndex--;
            }
            array[preIndex + 1] = current;   //把值插入
        }
        return array;
    }
}
