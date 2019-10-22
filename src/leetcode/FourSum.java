package leetcode;

import java.util.HashMap;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/5 20:40
 */
/*
四数之和，在数组A、B、C、D有多少不同组合，4数之和为0，4个数组的长度均相同
*/
public class FourSum {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int n = A.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum = A[i]+B[j];
                map.put(sum,map.getOrDefault(sum,0)+1);//map中有sum这个key，就返回这个key的value。无，则返回default值
            }
        }
        int result=0;
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map2.containsKey(C[i])){
                result+=map2.get(C[i]);
                continue;
            }
            int increment=0;
            for(int j=0;j<n;j++){
                int sum = 0-C[i]-D[j];
                if(map.containsKey(sum)){
                    increment+=map.get(sum);
                }
            }
            result+=increment;
            map2.put(C[i],increment);
        }
        return result;
    }
}
