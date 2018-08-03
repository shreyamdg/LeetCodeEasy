package linkedLists;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
		ListNode currNode = head;
		ListNode prevNode = null;
		ListNode nextNode = null;

		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		return prevNode;
	}
}
