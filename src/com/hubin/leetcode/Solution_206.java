package com.hubin.leetcode;

public class Solution_206 {
     public ListNode reverseList(ListNode head) {
        if(head==null)
          return null;
        ListNode pre=null;
        ListNode next=null;
        while (head!=null){
          next=head.next;
          head.next=pre;
          pre=head;
          head=next;
        }
         return pre;
     }
}
