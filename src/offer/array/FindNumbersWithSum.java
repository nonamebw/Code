package offer.array;
/*和为S的两个数字
        输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
        如果有多对数字的和等于S，输出两个数的乘积最小的。*/
import java.util.ArrayList;
public class FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;
        int j = array.length - 1;   //i,j可看做两个首尾指针，数组是有序的
        if(array == null || j<1)
            return arrayList;
        while (i<j){
            if(array[i]+array[j]==sum){
                arrayList.add(array[i]);
                arrayList.add(array[j]);
                return arrayList;   //首尾指针的形式，可以保证和为sum时，乘积最小，首尾分得越开乘积越小
            }
            if(array[i]+array[j]>sum){ //大了就把尾指针往前调
                j--;
            }else {
                i++;   //小了就把首指针往后调
            }
        }
        return arrayList;
    }
}
