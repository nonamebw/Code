package leetcode.linkedlist;

/**
 * @author non
 * @version 1.0
 * @date 2019/9/6 10:04
 */
/*长度相同的两个链表中的数依次相加，逢10进位
        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.*/
public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode cur, dummy = new ListNode(0);
        cur = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(carry%10);
            carry /= 10;
            cur = cur.next;
        }
        return dummy.next;
    }
}
