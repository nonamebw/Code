package offer.linkedList;

import offer.linkedList.ListNode;

/*删除链表中重复的结点
        在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，
        返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5*/
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead)
    {
        //设置一个trick 仅用于返回头结点  并解决了第一个结点是重复结点的问题
        ListNode first = new ListNode(-1);

        first.next = pHead;

        ListNode cur = pHead;
        ListNode last = first;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                int val = cur.val;
                //重复结点可能有很多个
                while (cur!= null&&cur.val == val)
                    cur = cur.next;
                last.next = cur;
            } else {
                last = cur;
                cur = cur.next;
            }
        }
        return first.next;

    }
}
