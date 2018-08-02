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
				// curr = pre.next;
			} else {
				pre = pre.next;
				// curr = curr.next;
			}
		}
		return head;
	}
}
