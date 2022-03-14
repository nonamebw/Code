package offer.againBySort;

/**
 * @author xuchen.pbw
 * @description 二维数组找整数
 * @date 2022/3/14
 *
 * 题目：二维数据，每行从左到右递增，每列从上到下递增。输入一个这样二维数据和一个整数，判断数组中是否含有该整数。
 */
public class Again1 {

    //暴力解法
    public static boolean find1(int[][] arry,int x){
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                if (arry[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean find2(int[][] arry,int x){
        int row = arry.length -1; //数组的行
        int col = 0; //数组的列
        while (row >= 0 && col < arry[0].length) {
            if (arry[row][col] > x) {
                row--;
            }else if (arry[row][col] < x) {
                col++;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(find2(array,8));
    }

}
