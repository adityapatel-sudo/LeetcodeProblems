package com.company.LinkedList;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null || head.next.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode zoom = head;
        while(zoom.next != null && zoom.next.next!=null){
            zoom = zoom.next.next;
            slow = slow.next;
            if(head == null || head.next == null || head.next.next == null){
                break;
            }
            if(zoom==slow){
                return true;
            }
        }
        return false;
    }
}
