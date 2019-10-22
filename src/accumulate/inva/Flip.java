package accumulate.inva;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/16 19:49
 */
public class Flip {
    public int[][] flipChess(int[][] A, int[][] f) {
        for (int i = 0; i < f.length; i++) {
            int x = f[i][0] - 1;
            int y = f[i][1] - 1;
            if (y<A[0].length-1)
                A[x][y+1] ^= 1;
            if (y>0) {
                A[x][y-1] ^= 1;
            }
            if (x<A.length-1) {
                A[x+1][y] ^= 1;
            }
            if (x>0) {
                A[x-1][y] ^= 1;
            }

        }
        return A;
    }
}
