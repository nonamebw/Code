package leetcode;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/5 18:40
 */
/*反转二进制字节流
* 1100变成0011*/
public class ReverseBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(reverseBit(13)));
    }

    public static int reverseBit(int n){
        int mask = 1;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;//result循环左移，一位一位存n右移的值，达到反转的目的
            result |= (n&mask);//取n的最低位给result
            n >>= 1;//将n循环右移
        }
        return result;
    }
}
