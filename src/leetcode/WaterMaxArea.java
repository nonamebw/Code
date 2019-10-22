package leetcode;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/8 11:10
 */
/*能包含最多的水
数组的下标是横坐标，下标对应的值是纵坐标，构成一个柱状图
这个柱状图空间中，最多能容纳多少的水
Input: [1,8,6,2,5,4,8,3,7]
Output: 49
*/
public class WaterMaxArea {
    public int maxArea(int[] height) {
        int i =0 , j = height.length-1;
        int water = 0;
        while (i<j){
            int h = Math.min(height[i],height[j]); //高度取小的一个
             water = Math.max(water,h*(j-i));  //在整个过程中记录最多的水
             while (height[j]<=h && i<j) j--;  //那边高度低了，就加高那边。直到高度有所上升
             while (height[i]<=h && i<j) i++;  //因为最开始横坐标差距最大，那些比端上更低的高度，水肯定不是最多的。
        }
        return water;
    }
}
