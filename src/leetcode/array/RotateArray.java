package leetcode.array;
/*Rotate Array
        Given an array, rotate the array to the right by k steps, where k is non-negative.
        Input: [1,2,3,4,5,6,7] and k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]*/

//一位一位，反转数组后面得数到前面
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums.length<=0 || k<=0) return;
        k %= nums.length;  //k的长度可能比数组长度长很多
      while (k>0){
          reverse(nums);
          k--;
      }
    }

    public void reverse(int[] nums){
        int temp = nums[nums.length-1];
        for (int i = nums.length-2; i >=0; --i) {
            nums[i+1] = nums[i];
        }
        nums[0] = temp;
    }
}
