package leetcode.array;

import java.util.Arrays;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/8 10:28
 */
//查找n+1长的数组中，有且仅有的一个重复数字。数组中数字取值范围在1到n
    //使用arrays.sort会超过时间复杂度
public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]]==true)
                return nums[i];
            else
                arr[nums[i]] = true;
        }
        return -1;
    }
}
