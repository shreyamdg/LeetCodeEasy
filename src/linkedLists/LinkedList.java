package linkedLists;

/*
 * author: Shreyam Duttagupta
 */

/*
 * Defines a class node with Private fields: Data and Next.
 * Contains 4 methods which are getter and setters of private fields.
 */

class Node {
	public int data;
	public Node next;
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

/*
 * Defines a LinkedList with the below functionality:
 * 1) getSize: Returns the size of the LinkedList.
 * 2) isEmpty: Returns if the LinkedList is empty or not.
 * 3) insertAtStart: Takes an Integer Value as a parameter and inserts at the head of the list.
 * 4) insertAtEnd: Takes an Integer Value as a parameter and inserts at the tail of the list.
 * 5) insertAtPos: Takes an Integer Value and Integer position as a parameter and inserts the value in the specified position.
 * 6) deleteAtPos: Takes an Integer Value as a parameter and deletes the Node in the specified position.
 * 7) findNodeinIndex: Takes an Integer Value as a parameter and return the Node in the position
 * 8) findIndexofNode: Takes an Node as a parameter and return the Index in the LinkedList
 * 9) printList: Prints the LinkedList.
 */

public class LinkedList {
	
	protected Node head;
	protected Node tail;
	protected int size;
	
	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void ifHeadNull(Node head, int val){
		head = new Node(val, null);
		tail = head;
		size++;
	}
	
	public void insertAtStart(int val) {
		if(head == null) {
			ifHeadNull(head,val);
		}else {
			Node firstNode = new Node(val,null);
			firstNode.next = head;
			head = firstNode;
			size++;
		}
	}
	
	public void insertAtEnd(int val) {
		if(head == null) {
			ifHeadNull(head,val);
		}else {
			Node lastNode = new Node(val,null);
			tail.next = lastNode;
			tail = lastNode;
			size++;
		}	
	}
	
	public void insertAtPos(int val, int pos) {
		if (head == null) {
			ifHeadNull(head,val);
		}

		if (pos == 0) {
			insertAtStart(val);
		} else {
			Node newNode = new Node(val, null);
			int currPos = 0;
			Node currNode = head;
			while (currPos < pos-1 && currNode.next != null) {
				currNode = currNode.next;
				currPos++;
			}

			Node nodeInPos = currNode.next;
			currNode.next = newNode;
			newNode.next = nodeInPos;
			size++;
		}
	}
	
	public void deleteAtPos(int pos) {
		if (head == null) {
			return;
		}

		if (pos == 0) {
			head = head.next;
			size--;
		}
		if (pos <= size) {
			int currPos = 0;
			Node currNode = head;
			while (currPos < pos-1 && currNode.next != null) {
				currNode = currNode.next;
				currPos++;
			}
			currNode.next = currNode.next.next;
			size--;
		} else
			return;

	}
	
	public Node findNodeinIndex(int pos) {
		Node nodeInPos = head;
		if (pos == 0) {
			return head;
		} else if (pos > size) {
			return null;
		} else {
			for (int i = 0; i < pos; i++) {
				nodeInPos = nodeInPos.next;
			}
			return nodeInPos;
		}
	}
	
	public int findIndexofNode(Node node) {
		Node currNode = head;
		int index = 0;
		while (currNode != node) {
			index++;
			currNode = currNode.next;
		}
		return index;
	}
	
	public void printList()
	{
		Node node = head;
		while(node != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}

}
