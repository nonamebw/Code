package leetcode.again;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/4/18
 *
 * 题目：删除链表的倒数第n个节点
 * 哨兵节点，快慢指针。快指针先走顺向n，剩余的路就是正向位数
 */
public class Again19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode p1 = tmp;
        ListNode p2 = tmp;

        for(int i = 0;i < n;i++){
            p1 = p1.next;
        }

        while(p1.next!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;

        return tmp.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
