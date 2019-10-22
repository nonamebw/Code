package accumulate.jd;


import java.util.Arrays;
import java.util.Scanner;
/*
0824
合唱团队形分组，部分有序，整体有序
       对合唱团队列进行分组，保证部分有序，整体有序，最多能分多少组。
*/
public class M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] high = new int[n];
        for (int i = 0; i < high.length; i++) {
            high[i] = scanner.nextInt();
        }

        int[] temp = high.clone();
        Arrays.sort(temp);

        int count = 0;
        int hightotal = 0;
        int temptotal = 0;

        for (int i = 0; i < temp.length; i++) {
            hightotal = hightotal + high[i];
            temptotal = temptotal + temp[i];
            if (hightotal==temptotal){
                count++;
                hightotal = 0;
                temptotal = 0;
            }
        }
        System.out.println(count);
    }
}
