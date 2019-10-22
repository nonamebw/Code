package accumulate.Netease;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/26 11:26
 */
/*瞌睡
小易觉得高数课太无聊了，决定睡觉。不过他对课上的一些内容挺感兴趣，所以希望你在老师讲到有趣的部分的时候叫醒他一下。
        你知道了小易对一堂课每分钟知识点的感兴趣程度，并以分数量化，以及他在这堂课上每分钟是否会睡着，你可以叫醒他一次，
        这会使得他在接下来的k分钟内保持清醒。你需要选择一种方案最大化小易这堂课听到的知识点分值。*/
public class Sleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] fun = new int[n];
        int[] sleep = new int[n];
        int ans = 0;
        for (int i=0; i<n; ++i){
            fun[i] = scanner.nextInt();
        }
        for (int i=0; i<n; ++i){
            sleep[i] = scanner.nextInt();
            if(sleep[i]==1)
                ans += sleep[i];
        }

        int res = 0;
        int max = 0;
        int m = 0;
        if(k>=n){
            for (int i=0; i<n; ++i){
                if (sleep[i]==0)
                    ans += sleep[i];
            }
            System.out.println(ans);
        }else {
            while (m<n){
                if(m+k<=n){
                    for (int i=m; i<k; ++i){
                        if (sleep[i]==0){
                            res = res + sleep[i];
                        }
                    }
                    max = Math.max(max,res);
                }
                ++m;
            }
            System.out.println(ans+max);
        }
    }
}
