package accumulate.meituan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FIndInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)>=48 && str.charAt(i)<=57) || str.charAt(i)=='-'){
                result = result + str.charAt(i);
            }else {
                queue.add(result);
                result = "";
            }
        }
        for (String s : queue) {
            System.out.print(s+",");
        }
    }
}
