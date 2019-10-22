package algorithm.sort;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/18 23:01
 */
public class QuickSort2 {
    private static int Partition(int[] arr, int start, int end) {
        int key = arr[start];
        while (start < end) {
            while (arr[end] >= key && end > start)
                end--;
            arr[start] = arr[end];
            while (arr[start] <= key && end > start)
                start++;
            arr[end] = arr[start];
        }
        arr[start] = key;
        return start;
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = Partition(arr, start, end);
            quickSort(arr, start, index - 1);  //void类型的递归调用
            quickSort(arr, index + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,5,8,3,9,33,56,23};
        quickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.printf(i+",");
        }
    }
}
