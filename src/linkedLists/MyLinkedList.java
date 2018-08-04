package linkedLists;

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

class MyLinkedList {

	class Node {
		public int val;
		public Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	Node head = null;
	int size;

	/** Initialize your data structure here. */
	public MyLinkedList() {
		size = 0;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int pos) {
		if (head == null || pos >= size)
			return -1;

		Node nodeInPos = head;
		for (int i = 0; i < pos; i++) {
			nodeInPos = nodeInPos.next;
		}
		return nodeInPos.val;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		if (head == null) {
			head = new Node(val);
			size++;
		} else {
			Node firstNode = new Node(val);
			firstNode.next = head;
			head = firstNode;
			size++;
		}
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		if (head == null) {
			head = new Node(val);
			size++;
		} else {
			Node lastNode = new Node(val);
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = lastNode;
			size++;
		}
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int pos, int val) {
		if (pos > size) {
			return;
		}

		if (pos == 0) {
			addAtHead(val);
		} else if (pos == size) {
			addAtTail(val);
		} else {
			Node newNode = new Node(val);
			int currPos = 0;
			Node currNode = head;
			while (currPos < pos - 1 && currNode.next != null) {
				currNode = currNode.next;
				currPos++;
			}
			newNode.next = currNode.next;
			currNode.next = newNode;
			size++;
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int pos) {
		if (head == null || pos >= size) {
			return;
		}

		if (pos == 0) {
			head = head.next;
			size--;
		}
		if (pos < size) {
			int currPos = 0;
			Node currNode = head;
			while (currPos < pos - 1 && currNode.next != null) {
				currNode = currNode.next;
				currPos++;
			}
			currNode.next = currNode.next.next;
			size--;
		} else
			return;
	}
}
