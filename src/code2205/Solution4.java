package code2205;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/30
 *
 * 1、冒泡排序，正序，比较次数最小
 * 2、100个线程 1000，倒叙不重复，同时启动打印任务
 * 3、接口实现类，不能用if else switch ？ ：三元操作符
 */
public class Solution4 {

    public static void main(String[] args) {

    }

    public static int[] sort(int[] arr){
        if(arr==null || arr.length<2) return arr;
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length -i-1; j++) {
                if (arr[j + 1] < arr[j]) {
                    flag = false;
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
            if(flag) break;
        }
        return  arr;
    }

    public static int[] bubbleSort(int[] nums){
        int tmp = 0;
        boolean swap = true;
        for(int i=nums.length-1; i>0; i--){
            swap = true;
            for(int j=0; j<i; j++){
                if(nums[j]>nums[j+1]){ //让nums[j]始终最大
                    swap=false;
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
            if(swap) break; //这一轮没有进行交换，全部排序成功
        }
        return nums;
    }

    public static int[] selectionSort(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }

    public static int[] quickSort(int[] nums,int start, int end){
        if(start > end) return nums;
        int key = nums[start], i=start, j=end;
        while (i!=j){
            while (j>i && nums[j]>=key) j--;
            while (j>i && nums[i]<=key) i++;
            if(j>i){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        nums[start] = nums[i];
        nums[i] = key;
        quickSort(nums,i+1,j);
        quickSort(nums,start,i-1);
        return nums;
    }
}
