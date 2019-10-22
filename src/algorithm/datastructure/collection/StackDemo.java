package algorithm.datastructure.collection;

import java.util.Stack;

/**
 * @author non
 * @version 1.0
 * @date 2019/8/27 10:14
 */
public class StackDemo {
    /**
     * 这里仅仅测试Stack源码中提供的方法、而不再测试Stack从Vector中继承的方法、所以示例也很简单
     */
    private static void testStack(){
        //初始化一个含有字符“abcde”的Stack
        Stack<String> stack = new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        //查看Stack中栈顶元素
        System.out.println("the top element of stack : " + stack.peek());
        System.out.println(stack);
        //查看并弹出Stack栈顶元素
        System.out.println("the top element of stack : " + stack.pop());
        System.out.println(stack);
        //查看Stack是否包含“e”
        System.out.println("the index of 'e' in stack : " +stack.search("e"));
        //查看Stack是否为空
        System.out.println("is the stack empty?  " + stack.empty());
    }

    public static void main(String[] args) {
        testStack();
    }

}
