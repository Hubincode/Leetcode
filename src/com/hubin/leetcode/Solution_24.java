package com.hubin.leetcode;

public class Solution_24 {
    public ListNode swapPairs(ListNode head) {
//        ListNode listNode=head;
//        while(listNode!=null&&listNode.next!=null){
//            swapPairs2(listNode);
//            listNode=listNode.next.next;
//        }
//        return listNode;
//    }
//    public void swapPairs2(ListNode head) {
//        if(head==null||head.next==null)
//            return;
//        ListNode next=head.next,ptr=head;
//        head.next=next.next;
//        next.next=head;
//        head=next;
//        next=ptr;
//    }
        if (head == null || head.next == null) return head;
        ListNode newhead = head.next;
        head.next = swapPairs(newhead.next);
        newhead.next = head;
        return newhead;

    }
}
