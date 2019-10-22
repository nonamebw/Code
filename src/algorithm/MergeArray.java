package algorithm;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/9 12:37
 */
//合并两个有序数组
public class MergeArray {
    /**
     * 把有序数组a和有序数组b 合并到数组c中，这里假设数组c的容量足够大，可以容纳数组a和数组b中的所有元素。
     * @param a
     * @param n 数组a的长度n
     * @param b
     * @param m 数组b的长度m
     * @param c
     */
    public static void mergeArray(int a[], int n, int b[], int m, int c[]){
        int i,j,k;
        //索引
        i=j=k=0;

        while (i < n && j < m){
            if(a[i] < b[j]){
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        //将数组a或则b中剩余的元素加入数组c中
        while (i<n){
            c[k++] = a[i++];
        }

        while (j < m){
            c[k++] = b[j++];
        }
    }//end
}
