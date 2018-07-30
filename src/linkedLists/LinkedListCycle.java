package linkedLists;

import java.util.HashSet;
 
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
    
    // Using Floyd’s Cycle-Finding Algorithm:
    
    public boolean hasCycleSecondSolution(ListNode head) {
    	ListNode slowNode = head;
    	ListNode fastNode = head;
    	
    	while(slowNode != null && fastNode !=null) {
    		slowNode = slowNode.next;
    		fastNode = fastNode.next.next;
    		if(slowNode == fastNode) {
    			System.out.println("Loop Found");
    			return true;
    		}
    	}
    	return false;
    }
}

