package offer.array;
/*连续子数组的最大和
        例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
        给一个数组，返回它的最大连续子序列的和*/
public class LongestSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int greatestSum = 0x80000000;
        int sum = 0;
      /*  int startIndex = 0;
        int endIndex = 0;*/
        for(int i=0;i<array.length;i++){
            if(sum<0){
                sum = array[i];    //当加上前一个数后sum小于零，sum就应该被重置为array[i]
            }else {
                sum = sum + array[i];  //用一个sum记录一段子数组的和
            }

            if(sum>greatestSum){    //每加一个数后，多要判断当前子数组的和是不是最大的，最大就用greatestSum保存
                greatestSum = sum;
                //endIndex = i;
            }
        }

     /*   System.out.println("endIndex:"+endIndex);
        while ( endIndex>=0 ){
            greatestSum = greatestSum - array[endIndex];
            if (greatestSum==0){
                startIndex = endIndex;
            }
            endIndex--;
        }
        System.out.println("startIndex:"+startIndex);*/

        return  greatestSum;
    }

    public static void main(String[] args) {
        int[] arr = {6,-3,-2,7,-15,1,2,2};
        System.out.println(new LongestSubArray().FindGreatestSumOfSubArray(arr));
    }
}
