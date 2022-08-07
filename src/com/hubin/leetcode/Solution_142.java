package com.hubin.leetcode;

public class Solution_142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow=head,fast=head;
        while(slow.next!=null&&fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode ptr=head;
                while (ptr!=slow){
                    ptr=ptr.next;
                    slow=slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
