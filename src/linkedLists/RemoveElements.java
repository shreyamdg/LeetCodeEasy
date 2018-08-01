package linkedLists;

public class RemoveElements {

	public ListNode removeElements(ListNode head, int val) {

		ListNode curr = head.next;
		ListNode pre = head;
		while (curr != null) {
			if (head == null) {
				return null;
			}
			if (head.val == val)
				head = head.next;
			else if (curr.val == val) {
				pre.next = curr.next;
				curr = pre.next;
			} else {
				pre = pre.next;
				curr = curr.next;
			}
		}

		return head;
	}

}
