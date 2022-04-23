package leetcode.again;

import java.util.*;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/4/18
 *
 * 题目：三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 */
public class Again15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            Map<Integer,Integer> map = new HashMap<>();
            for (int j = 0; j < nums.length; j++) {
                if (i==j){
                    continue;
                }
                if (map.containsKey(nums[j])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[map.get(nums[j])]);
                    //TODO::去重
                    res.add(list);
                }else {
                    map.put(target - nums[j],j);
                }
            }
        }
        return res;
    }
}
