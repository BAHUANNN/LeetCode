package com.company;

import java.util.*;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        pre.next = head;
        ListNode first,second;
        first = head;
        second = head.next;

        while(first != null && second != null){
            pre.next = second;
            first.next = second.next;
            second.next = first;

            pre = first;
            first = first.next;
            if(first == null)break;
            second = first.next;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}