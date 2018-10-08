package com.company;

import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode first = lists[0];
        if(lists.length == 1)return first;
        ListNode second = lists[1];
        ListNode last = lists[1];
        for(int i = 1; i < lists.length; i++){
            if(i != 1)last.next = lists[i];
            while(last.next != null){
                last = last.next;
            }
        }

        while(second != null){
            ListNode tempFirst = first;
            while(tempFirst != null){
                if(second.val < first.val){
                    second.next = first;
                    first = second;
                    break;
                }else if(second.val > tempFirst.val && tempFirst.next == null){
                    tempFirst.next = second;
                    second.next = null;
                    break;

                }else if(second.val > tempFirst.val && second.val < tempFirst.next.val){
                    second.next = tempFirst.next;
                    tempFirst.next = second;
                    break;

                }
            }
            second = second.next;
        }
        return first;
    }
}
//连接除了第一个链表外的其他链表，然后对第一个链表进行插入排序
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}