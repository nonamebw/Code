package leetcode;

import java.util.*;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/3 9:48
 */
/*找出数组中的三个数为零
    Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
        Find all unique triplets in the array which gives the sum of zero.*/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for(int j = i+1; j < nums.length; j++) {
                int key = -nums[i] - nums[j];

                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                if(numsMap.containsKey(key) && numsMap.get(key) > j) {
                    result.add(Arrays.asList(nums[i], nums[j], key));
                }
            }
        }

        return result;
    }
}
