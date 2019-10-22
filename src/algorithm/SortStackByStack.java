package algorithm;

import java.util.Stack;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/17 16:02
 */
public class SortStackByStack {
    public void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> helper = new Stack<>();
        while (!stack.isEmpty()){
            int cur = stack.pop();
            while (!helper.isEmpty() && cur<helper.peek() ){
                stack.push(helper.pop());
            }
            helper.push(cur);
        }

        while (!helper.isEmpty())
            stack.push(helper.pop());

        while (!stack.isEmpty())
            System.out.println(stack.peek());
    }
}
