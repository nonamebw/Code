package code2205;

import java.util.*;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/6/1
 */
public class Solution5 {

        public static List<Integer> helper(int[] nums,int k){
        if (nums.length==0) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
            for (int num : nums) {
                System.out.print(num);
            }

        for(int i=nums.length-1; i>=nums.length - k; i--){
            res.add(nums[i]);
        }
        return res;
    }

    public static List<Integer> solutionByHeap(int[] input, int k) {
        List<Integer> list = new ArrayList<>();
        if (k > input.length || k == 0) {
            return list;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int num : input) {
            if (queue.size() < k) {
                queue.add(num);
            } else if (queue.peek() > num){
                queue.poll();
                queue.add(num);
            }
        }
        while (k-- > 0) {
            list.add(queue.poll());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,9,3,4,5};
        List<Integer> res =solutionByHeap(a,2);
        for (Integer re : res) {
            System.out.print(re + " ");
        }
    }

}
