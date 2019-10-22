package accumulate;
import java.util.Scanner;

public class MM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int[] arr = new int[a];
        for (int i=0; i<a; ++i){
            arr[i] = scanner.nextInt();
        }

        int b = scanner.nextInt();

        for (int i=0; i<b; ++i){
            int res = arr[scanner.nextInt()-1];
//            System.out.println(res);
            float count = 0;
            double result = 0;
            for(int j=0; j<a; j++){
                if (arr[j]<=res)
                    count++;
            }
//            System.out.println("count:"+count);
            result = ((count-1)/(double) a)*100;
            String s = String.format("%.6f",result);
            System.out.println(s);
        }
    }

}
