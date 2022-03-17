package offer.againBySort;

import java.util.Stack;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/3/17
 * 题目：用两个栈实现队列
 */
public class Again5 {
    Stack<Integer> stackA = new Stack<>();
    Stack<Integer> stackB = new Stack<>();

    //压栈
    public void listIn2(int i){
        stackB.push(i);
    }

    //出栈
    public Integer listOut2(){
        if (stackA.isEmpty() && stackB.isEmpty()) {
            return null;
        }
        if (stackA.isEmpty()) {
            while (!stackB.isEmpty()) {
                stackA.push(stackB.pop());
            }
        }
        return stackA.pop();
    }

    public int listOut1(){
       return stackA.pop();
    }

    public void listIn1(int i){
        while (!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }
        stackB.push(i);
        while (!stackB.isEmpty()){
            stackA.push(stackB.pop());
        }
    }
}
