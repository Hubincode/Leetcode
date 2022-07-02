package com.hubin.leetcode;

import org.junit.Test;

public class Solution_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode node=head;
        while(node!=null){
            len++;
            node=node.next;
        }
        ListNode dump=new ListNode(0,head);
        node=dump;
        for(int i=1;i<len-n+1;++i){
            node=node.next;
        }
        node.next=node.next.next;
        return dump.next;
    }
    @Test
    public  void test(){
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        Solution_19 solution_19=new Solution_19();
        System.out.println(solution_19.removeNthFromEnd(head,2));
    }
}
