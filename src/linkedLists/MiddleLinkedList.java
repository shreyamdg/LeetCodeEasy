package linkedLists;

public class MiddleLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode curr = head;
		int count = len(curr) / 2;

		while (count != 0 && head.next != null) {
			head = head.next;
			count = count - 1;
		}
		return head;
	}

	public int len(ListNode curr) {
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}
}
