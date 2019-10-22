package accumulate.weibo;

import java.util.Scanner;
/*求软件最小版本号*/
public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] res = input.split(",");
        String min = res[0];
        for (int i = 1; i < res.length; i++) {
            min = compare(min,res[i]);
//            min = compare(min,res[i+1]);
        }
        System.out.println(min);
    }

    public static String compare(String opt , String opt2){
        String[] ver = opt.split("\\.");
        String[] ver2 = opt2.split("\\.");
        int minLen = Math.min(ver.length,ver2.length);
        for (int i = 0; i < minLen; i++) {
            if (Integer.parseInt(ver[i])>Integer.parseInt(ver2[i])){
                return opt2;
            }
            if (Integer.parseInt(ver[i])<Integer.parseInt(ver2[i])){
                return opt;
            }
        }
        //短版本是长版本前缀，即相同，返回短版本。
        return ver.length<ver2.length ? opt : opt2;
    }
}
