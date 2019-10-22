package offer.linkedList;

import offer.linkedList.ListNode;

/*合并两个排序的链表
        输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。*/
public class MergeLinkedList {
    public ListNode mergeLinkedList(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        ListNode mergehead = null;
        if(list1.val<=list2.val){
            mergehead = list1;
            mergehead.next = mergeLinkedList(list1.next,list2); //这步做了剩下的由递归完成
        }else{
            mergehead = list2;
            mergehead.next = mergeLinkedList(list1,list2.next);
        }
        return mergehead;
    }
}
