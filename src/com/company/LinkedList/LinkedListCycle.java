package com.company.LinkedList;

public class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null || head.next.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(head == null || head.next == null || head.next.next == null){
                break;
            }
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
