package leetcode.array;

import java.util.ArrayList;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/8 10:12
 */
//寻找数组中，峰值元素。峰值元素定义为，比相邻的元素都大。
public class FindPeakElement {
    public int[] findPeakElement(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                arrayList.add(nums[i]);
            }
        }

        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}
