package linkedLists;

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> s = new HashSet<ListNode>();
        while (head != null)
        {
            if (s.contains(head))
                return true;
            
            s.add(head);
            head = head.next;
        }
   
        return false;
    }
}

