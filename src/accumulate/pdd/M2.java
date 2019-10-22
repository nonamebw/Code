package accumulate.pdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
/*
数列分奇偶排序，偶先奇后，大先小后，输出排序后指定个数
*/
public class M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] orgin = input.split(";");
        int n = Integer.parseInt(orgin[1]);
        System.out.println(n);
        String[] arr = orgin[0].split(",");
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length;i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0){
                even.add(Integer.parseInt(arr[i]));
            }else {
                odd.add(Integer.parseInt(arr[i]));
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < odd.size(); i++) {
            stack.push(odd.get(i));
        }
        for (int i = 0; i < even.size(); i++) {
            stack.push(even.get(i));
        }

        String result = "";
        for (int i = 0; i < n-1; i++) {
            result = result + stack.pop() + ",";
        }
        result = result + stack.pop();
        System.out.println(result);
    }
}
