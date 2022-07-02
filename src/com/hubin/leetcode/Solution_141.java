package com.hubin.leetcode;

public class Solution_141 {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode slow,fast;
        slow=head;
        fast=head.next.next;
        while((slow!=null)&&(fast!=null)&&(fast.next!=null)){
            if(slow==fast) return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
