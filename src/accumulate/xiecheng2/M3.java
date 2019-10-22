package accumulate.xiecheng2;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/14 11:45
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 /*豚厂办公区里到处摆放着各种各样的零食，人力资源部的调研发现，员工如果可以在自己喜欢的美食旁边工作，
         工作效率会大大提高，因此，豚厂决定进行一次员工座位大调整。
         调整方法如下：
         a) 首先将办公区按照各种零食的摆放分成N个不同的区域。（例如：可乐区，饼干区，水果区等等）；
         b) 每个员工对不同零食区域有不同的喜好程度（喜好程度的范围为1—100的整数，喜好程度越大表示员工越希望被调整到相应的零食区域）；
         c) 由于每个零食区域可以容纳的员工数量有限，人力资源部希望找到一个最优的调整方案使总的喜好程度最大*/
public class M3 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int BestMatch(int[] LimitArray, int[][] DegMatrix) {
        return 175;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;



        int _LimitArray_size = 0;
        int _DegMatrix_rows = 0;
        int _DegMatrix_cols = 0;
        _DegMatrix_rows = Integer.parseInt(in.nextLine().trim());
        _DegMatrix_cols = Integer.parseInt(in.nextLine().trim());
        _LimitArray_size = _DegMatrix_cols;

        int[] _LimitArray = new int[_LimitArray_size];
        int _LimitArray_item;
        for(int _LimitArray_i = 0; _LimitArray_i < _LimitArray_size; _LimitArray_i++) {
            _LimitArray_item = Integer.parseInt(in.nextLine().trim());
            _LimitArray[_LimitArray_i] = _LimitArray_item;
        }

        int[][] _DegMatrix = new int[_DegMatrix_rows][_DegMatrix_cols];
        for(int _DegMatrix_i=0; _DegMatrix_i<_DegMatrix_rows; _DegMatrix_i++) {
            for(int _DegMatrix_j=0; _DegMatrix_j<_DegMatrix_cols; _DegMatrix_j++) {
                _DegMatrix[_DegMatrix_i][_DegMatrix_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        System.out.println(BestMatch(_LimitArray, _DegMatrix));
    }
}
