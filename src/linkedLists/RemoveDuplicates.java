package linkedLists;

public class RemoveDuplicates {

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode curr = head;

		while (curr != null) {
			if (curr.next != null && curr.val == curr.next.val) {
				curr.next = curr.next.next;
			} else
				curr = curr.next;
		}

		return head;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(2);
		/*
		 * ListNode n4 = new ListNode(3); ListNode n5 = new ListNode(3);
		 */

		n1.next = n2;
		n2.next = n3;
		n3.next = null; // n4.next =n5; n5.next= null;

		/*
		 * ListNode m1 = new ListNode(1); ListNode m2 = new ListNode(3); ListNode m3 =
		 * new ListNode(4);
		 * 
		 * m1.next = m2; m2.next = m3; m3.next = null;
		 */

		ListNode deleted = deleteDuplicates(n1);
	}

}
