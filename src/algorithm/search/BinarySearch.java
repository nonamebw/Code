package algorithm.search;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/4/12
 */
public class BinarySearch {

    public static int binarySearch1(int num[],int key,int low,int high) {
        if (num[low] > key || num[high] < key || low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (num[mid] > key) {
            return binarySearch1(num,key,low,mid-1);
        }else if (num[mid] < key) {
            return   binarySearch1(num,key,mid+1,high);
        }else {
            return num[mid];
        }
    }

}
