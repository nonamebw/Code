package accumulate.pdd;

import java.util.Scanner;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/21 21:35
 */
//输入两个数组A、B，仅仅改变A中的一个元素，就能使得A数组是严格递增的
//在数组B中找出能替换这个元素的数字的最大值，并输出替换后严格增长的数组A。若无则输出NO
public class IncreaseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String[]  c = a.split(" ");
        String[]  d = b.split(" ");
        int[] e = new int[c.length];
        int[] f = new int[d.length];
        for(int i=0;i<e.length;++i){
            e[i] = Integer.parseInt(c[i]);
        }
        for(int i=0; i<f.length; ++i){
            f[i] = Integer.parseInt(d[i]);
        }

        int index = -1;
        for(int i=0; i<e.length - 1; ++i){
            if(e[i]>e[i+1])
                index = i;
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<f.length; ++i){
            if(index == 0){
                if(e[1]>f[i])
                    max = Math.max(max,f[i]);
            }else {
                if(e[index-1] < f[i] && f[i]<e[index+1] )
                    max = Math.max(max,f[i]);
            }

        }

        if (max == Integer.MIN_VALUE){
            System.out.println("NO");
        }else {
            e[index] = max;
            for(int i : e){
                System.out.print(i);
            }
        }
    }
}
