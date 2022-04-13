package leetcode.again;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/4/13
 *
 * 题目：整数反转
 * 输入：x = 123
 * 输出：321
 *
 * -231 <= x <= 231 - 1
 */
public class Again7 {
    public int reverse(int x) {
        long jinWei = 0;
        while (x != 0) {
            jinWei = jinWei * 10 + x % 10;
            x = x / 10;
        }
        //把jinWei强制转换为int类型与long类型jinWei进行比较，可以改变jinWei的取值方式然后再跟long的jinWei进行比较，避免发生返回溢出的int错误数值！
        return (int)jinWei == jinWei ? (int) jinWei : 0;
    }
}
