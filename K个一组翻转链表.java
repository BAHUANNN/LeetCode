package com.company;

import java.util.*;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode[] l = new ListNode[k];
        l[0] = head;
        //1
        for (int i = 1; i < k; i++) {
            ListNode temp = l[i-1].next;
            if(temp == null)return head;
            l[i] = temp;
        }
        //2
        ListNode after = reverseKGroup(l[k-1].next,k);
        //3
        for (int i = k-1; i >= 1 ; i--) {
            l[i].next = l[i-1];
        }
        l[0].next = after;

        return l[k-1];
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}