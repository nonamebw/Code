package leetcode;
/*Climbing Stairs 青蛙跳台阶*/
public class ClimbStairs {
    public int climbStairs(int n) {
        if(n<=0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        int p = 1, q = 2;
        for(int i=3;i<=n;++i){
            q = q + p;
            p = q - p;
        }
        return q;
    }
}
