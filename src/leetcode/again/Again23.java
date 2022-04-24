package leetcode.again;

import javax.print.attribute.standard.NumberUp;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author xuchen.pbw
 * @description
 * @date 2022/4/24
 *
 * 题目：合并K个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 *
 * 用容量为K的最小堆优先队列，把链表的头结点都放进去，然后出队当前优先队列中最小的，挂上链表，，然后让出队的那个节点的下一个入队，再出队当前优先队列中最小的，直到优先队列为空
 */
public class Again23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (ListNode list : lists) {
            if (list == null) continue;
            priorityQueue.add(list);
        }

        ListNode dummyListNode = new ListNode(0);
        ListNode cur = dummyListNode;

        while (priorityQueue.isEmpty()) {
            ListNode pullNode = priorityQueue.poll();
            cur.next = pullNode;
            cur = cur.next;
            if (pullNode.next != null) {
                priorityQueue.add(pullNode.next);
            }
        }
        return dummyListNode.next;
    }
}
