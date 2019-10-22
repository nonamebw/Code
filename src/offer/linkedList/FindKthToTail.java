package offer.linkedList;
/*链表中倒数第k个结点
        输入一个链表，输出该链表中倒数第k个结点。*/

import java.util.ArrayList;

public class FindKthToTail {
    public ListNode findKthToTail(ListNode head, int k) {
        ArrayList<ListNode> arrayList = new ArrayList<ListNode>();
        while(head != null){
            arrayList.add(head);
            head = head.next;
        }
        int length = arrayList.size();
        if(k>length || k<=0)
            return null;
        return arrayList.get(length-k);
    }
}
