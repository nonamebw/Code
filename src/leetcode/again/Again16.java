package leetcode.again;

import accumulate.sxf.M;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/5/10
 */
public class Again16 {
    public int threeSumClosest(int[] nums, int target) {
        int mostLike = 0;
        int gap = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int remain = target - nums[i];
            for (int j = i +1 ; j < nums.length - 1 ; j++) {
                int remain1 = remain - nums[j];
                for (int k = j+1; k < nums.length; k++) {
                    if (Math.abs(remain1 - nums[k]) < gap) {
                        gap = Math.abs(remain1 - nums[k]);
                        mostLike = nums[i] + nums[j] + nums[k];
                    }
                }

            }
        }
        return mostLike;
    }
}
