package com.hubin.leetcode;

public class Solution_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA,l2=headB;
        int index=0;
        while (index<2){
            if(l1==l2)
                return l1;
            else if (l1==null){
                l1=headB;
                index++;
            }else if(l2==null){
                l2=headA;
            }
            else {
                l1=l1.next;
                l2=l2.next;
            }

        }
        return null;
    }
}
