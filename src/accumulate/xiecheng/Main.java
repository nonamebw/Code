package accumulate.xiecheng;

import java.util.*;
//把链表中所有小于等于m的数按原有顺序放至链表头部。
public class Main {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode small = new ListNode(0);
        ListNode tailSm = small;

        ListNode large = new ListNode(0);
        ListNode tailLg = large;
        ListNode slider = head;
        while(slider != null) {
            if(slider.val <= m){
                tailSm.next = new ListNode(slider.val);
                tailSm = tailSm.next;
            } else {
                tailLg.next = new ListNode(slider.val);
                tailLg = tailLg.next;
            }
            slider = slider.next;
        }

        tailSm.next = large.next;

        return small.next;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}

