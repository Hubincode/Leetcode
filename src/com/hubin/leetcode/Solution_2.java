package com.hubin.leetcode;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Double integer1=new Double(ListNodeToString(l1));
        Double integer2=new Double(ListNodeToString(l2));
        ListNode listNode=StringToListNode(String.valueOf(integer1+integer2));
        return listNode;
    }
    public String ListNodeToString(ListNode listNode){
        String str= String.valueOf(new StringBuffer());
        while(listNode!=null){
            str=String.valueOf(listNode.val)+str;
            listNode=listNode.next;
        }
        return str;
    }
    public ListNode StringToListNode(String string){
        ListNode head=new ListNode();
        ListNode  listNode=head;
        Double aDouble=new Double(string);
        while(aDouble/10>0){
            listNode.val=(int)(aDouble%10);
            ListNode next=new ListNode();
            listNode.next=next;
            listNode=next;
            aDouble/=10;
        }
        if(aDouble!=0){
            listNode.val=aDouble.intValue();
            listNode.next=null;
        }else
            listNode=null;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2,new ListNode(4,new ListNode(3,null)));
        ListNode l2=new ListNode(5,new ListNode(6,new ListNode(4,null)));
 //       ListNode l1=new ListNode(1,null);
//        ListNode l2=new ListNode(1,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null))))))))));
        Solution_2 solution_2=new Solution_2();
        ListNode res=solution_2.addTwoNumbers(l1,l2);
    }
}
