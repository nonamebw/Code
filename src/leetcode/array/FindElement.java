package leetcode.array;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/7 11:25
 */
//查找目标元素在排序数组中的成对出现的角标。没有则返回[-1,-1]
public class FindElement {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1, -1};

        int left = searchEqualorGreater(nums, target);
        if(nums[left]!=target) return new int[]{-1, -1};
        int left_1 = searchEqualorGreater(nums, target+1);
        int right = -1;
        if(nums[left_1]>=target+1)
            right = left_1 - 1;
        else
            right = left_1;
        return new int[]{left, right};
    }

    public int searchEqualorGreater(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            //mid is always biased towards left
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target)
                lo = mid + 1;
            else
                //we want to move hi to the left
                hi = mid;
        }
        return lo;
    }
}
