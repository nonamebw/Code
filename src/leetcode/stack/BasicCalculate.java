package leetcode.stack;

import java.util.Stack;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/6 11:40
 */
/*一个包含基本+-/*运算的字符串算术表达式，求这个算术表达式的值。运算的数字都是非负的，算式中可能有空格
     Input: " 3+5 / 2 "
     Output: 5
     */

public class BasicCalculate {
    private int basicCaculate(String s){
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0, num = 0, op = '+'; i < s.length(); i++) {   // op is last operator
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num = num * 10 + (c - '0');
            if ("+-*/".indexOf(c) >= 0 || i == s.length() - 1) {    // must be 'if' or i=len-1 won't reach here
                if ("*/".indexOf(op) >= 0)                          // subtract top before mul/div
                    result -= stack.peek();
                switch (op) {
                    case '+': stack.push(num); break;
                    case '-': stack.push(-num); break;
                    case '*': stack.push(stack.pop() * num); break; // only non-negative int, impossible '2*-1'
                    case '/': stack.push(stack.pop() / num); break;
                }
                num = 0;
                op = c;
                result += stack.peek();
            }
        }
        return result;
    }
}
