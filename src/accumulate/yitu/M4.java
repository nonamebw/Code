package accumulate.yitu;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/11 19:45
 */
public class M4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        stack.push(scanner.nextInt());
        for (int i = 0; i < n-1; i++) {
            int temp = scanner.nextInt();
            if (temp>=stack.peek())
                stack.push(temp);
            else{
                while (!stack.isEmpty() && temp<stack.peek()){
                    helper.push(stack.pop());
                }
                stack.push(temp);
                while (!helper.isEmpty())
                    stack.push(helper.pop());
            }
        }

        int peek = stack.peek()/2;
        while (!stack.isEmpty()){
            if (stack.peek()>=peek)
                helper.push(stack.pop());

        }

    }
}
