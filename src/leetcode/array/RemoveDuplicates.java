package leetcode.array;
/*Remove Duplicates from Sorted Array
        Given a sorted array nums, remove the duplicates in-place such that each element appear only once
        and return the new length.Do not allocate extra space for another array, you must do this by
        modifying the input array in-place with O(1) extra memory.
        Given nums = [1,1,2],
        Your function should return length = 2, with the first two elements of nums being 1 and 2
        respectively.*/
//排序数组中去重，用一个指针记录数组中不重复数的位置
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int j=0;
        for (int i=0; i<nums.length; i++)
            if (nums[i]!=nums[j]) nums[++j]=nums[i];  //++j先自增，再赋值
        return ++j;
    }
}
