package leetcode;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/5 19:47
 */
/*
开方的近似值，二分查找法。
*/
public class Sqrt_x {
    public static void main(String[] args) {

    }
    public static int sqrtX(int x){
        if (x == 0 || x == 1) return x;
        // Binary Search
        int left = 0, right = x;
        while (left < right) {
            // mid = (left + right) / 2 can overflow if right > Integer.MAX_VALUE - left
            int mid = left + (right - left) / 2;
            // same thing here , mid * mid > x can overflow. replace by mid > x / mid
            if (mid*mid > x ) {
                right = mid - 1;
            } else {
                left = mid + 1;
                // if mid * mid < x but (mid + 1) * (mid + 1) > x then mid was the right answer
                if (left*left > x ) {
                    return mid;
                }
            }
        }
        return left;
    }
}
