package offer.againBySort;

import accumulate.xiecheng.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/3/15
 *
 * 题目：从尾到头打印链表
 */
public class Again3 {

    //先压栈再出栈，实现从尾到头逆转。
    public List<Integer> printListFromTailToHead(ListNode node){
        Stack<Integer> stack  = new Stack<>();
        while (node.next != null) {
            stack.push(node.val);
            node = node.next;
        }
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
