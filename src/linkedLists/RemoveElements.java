package linkedLists;

public class RemoveElements {

	public static ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		ListNode pre = head;
		while (pre != null) {
			if (head.val == val) {
				head = head.next;
				pre = head;
				continue;
			}
			ListNode curr = pre.next;
			if (curr != null && curr.val == val) {
				pre.next = curr.next;
			} else {
				pre = pre.next;
			}
		}
		return head;
	}
	
	public ListNode removeElementsAnotherSolution(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        while (head.next!=null) {
            if (head.next.val==val) {
                 head.next=head.next.next;
                
            }
            else
            head=head.next;
        }
        return dummy.next;
    }
	
	 public ListNode recursiveSolution(ListNode head, int val) {
         if(head==null){
             return null;
         }
       
      ListNode res=  removeElements(head.next,val);
           if(head.val==val){
               return res;
           }
       else head.next=res;
       return head;
   }
}
