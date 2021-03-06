package linkedLists;

public class IntersectionOfTwoLinkedList {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}

		ListNode currA = headA;
		ListNode currB = headB;

		while (currA != currB) {
			currA = currA == null ? headB : currA.next;
			currB = currB == null ? headA : currB.next;

		}
		return currA;

	}

}
