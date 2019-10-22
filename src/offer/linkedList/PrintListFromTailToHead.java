package offer.linkedList;
/*从尾到头打印链表
输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。*/
import java.util.ArrayList;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class PrintListFromTailToHead {
    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null){
            return res;
        }
        printListFromTailToHead(listNode.next); //递归就是起着流程控制作用的
        res.add(listNode.val);  // 每次递归应该真正执行的
        return res;
    }
}
