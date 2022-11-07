package com.studybilibili.polyparameter;

/**
 * @author Jiawei Zhou
 * 2022/11/6
 */
public class removeElements {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
    }
}
  class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode p = node;
        while(p.next != null){
            if(p.next.val == val){
                ListNode next = p.next;
                p.next = next.next;
            }else{
                p = p.next;
            }
        }
        return node.next;


    }
}
