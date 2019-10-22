package offer.linkedList;

import offer.linkedList.ListNode;

/*单链表中环的入口结点
        给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
        第一步，找环中相汇点。分别用p1，p2指向链表头部，p1每次走一步，p2每次走二步，

       a、第一步，找环中相汇点。分别用fast，slow指向链表头部，slow每次走一步，fast每次走二步，
       直到fast==slow找到在环中的相汇点。
       b、第二步，找环的入口。接上步，当fast==slow时，fast所经过节点数为2x,slow所经过节点数为x,
       设环中有n个节点，fast比slow多走r圈有2x=rn+x; x=rn;（r为圈数，n为一圈的结点数）可以看出
       slow实际走了多个环的步数，再让fast指向链表头部，slow位置不变。

        假设链表开头到环接口的距离是y，那么x-y表示slow指针走过的除链表开头y在环中走过的距离，
        那么slow再走y步，此时fast结点与slow结点相遇，fast == slow ，x-y+y=x = rn，
        即此时slow指向环的入口。*/
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class EntryNodeOfLoop {
    public ListNode entryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null)
            return null;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while(p2 != null && p2.next != null ){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){  //快慢指针，到这一步就说明有环。有环的话，环的大小确定，相遇点就确定，
                           // 相遇点就是起始点加上环的大小后的那个结点
                p2 = pHead;
                while(p1 != p2){  //再以相同的速度走，第一次相遇即是环的入口
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if(p1 == p2)
                    return p1;
            }
        }
        return null;
    }
}
