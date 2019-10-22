package algorithm.sort;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/17 15:24
 */
//希尔排序，缩小增量排序。
// 设定希尔增量，在每组增量内排序。增量逐渐在减小，最后再微调。
public class ShellSort {
    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2; //希尔增量，初始量为数组长度的一半
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;   //希尔增量减半
        }
        return array;
    }
}
