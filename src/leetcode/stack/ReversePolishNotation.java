package leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author non
 * @version 1.0
 * @date 2019/10/7 10:41
 */

//逆波兰表达式，数字在前，符号在后，遇到符号就用符号计算前两个值。直到最后仅有一个数字。
public class ReversePolishNotation {
    public static void main(String[] args) {

    }
    public int evalRPN(String[] tokens) {
        if (tokens.length==0 || tokens ==null)
            return 0;
        Deque<Integer> stack = new LinkedList<>();
        String operators = "+-*/";
        for (int i = 0; i < tokens.length; i++) {
            if (operators.contains(tokens[i])){
                int num1= stack.pop();
                int num2 = stack.pop();
                switch (tokens[i]){     //switch语句的写法，后面需要有break
                    case "+" : stack.push(num2+num1); break;
                    case "-" : stack.push(num2-num1); break;
                    case "*" : stack.push(num2*num1); break;
                    case "/" : stack.push(num2/num1); break;
                }
            }else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public int evalRPN2(String[] tokens) {
        if(tokens == null || tokens.length == 0) return 0;
        Deque<Integer> stack = new LinkedList<>();
        String operators = "+-*/";
        for(int i = 0;i< tokens.length;i++){
            if(operators.contains(tokens[i])){
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(tokens[i].equals("+")) stack.push(num2 + num1);
                else if(tokens[i].equals("-"))stack.push(num2 - num1);
                else if(tokens[i].equals("*"))stack.push(num2 * num1);
                else if(tokens[i].equals("/"))stack.push(num2 / num1);
            }else stack.push(Integer.valueOf(tokens[i]));
        }
        return stack.peek();
    }
}
