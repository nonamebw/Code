package offer.array;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/7 15:24
 */
//二分查找，while循环实现，递归实现。
// 二分查找必须在有序数组中进行。
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,99,101,104};
        binarySearch(arr,104);
//        System.out.println(bs(arr,0,2,5));
    }

    private static void binarySearch(int[] arr, int target){
        if (target<arr[0] ||target>arr[arr.length-1] || arr.length==0 || arr==null) {
            System.out.println("error!");
            return;
        }
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start<=end){  //这里是小于等于，target最后相当于被夹逼出来的
            mid = (start + end)/2;
            if (arr[mid]<target)
                start = mid + 1;
            if (arr[mid]==target) {
                System.out.println(mid);
                return;
            }
            if (arr[mid]>target)
                end = mid - 1;
        }
        System.out.println("不存在!");  //没有夹逼出来，则不存在
    }

    //递归实现
    private static int  bs(int[] arr, int start, int end, int target){
        if (arr.length==0 || arr==null || start>end || target>arr[end] || target<arr[start]){
            return -1;
        }
        int mid = (start + end)/2;
        if (arr[mid]<target){
            return bs(arr,mid+1,end,target); //递归一定要加return，不然就只调用了一次，没有压栈。
        }else if (arr[mid]>target){
            return bs(arr,start,mid-1,target);
        }else {
            return mid;
        }
    }
}
