package accumulate.cvte;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/15 19:42
 */
public class M {
    public void collect(int[][] voteR){
        int[]  arr = new int[10];
        for (int i = 0; i < voteR.length; i++) {
            for (int j = 0; j < voteR[0].length; j++) {
                int temp = voteR[i][j];
                arr[temp]++;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.println(i+" - "+arr[i]+"票");
        }
    }
}
