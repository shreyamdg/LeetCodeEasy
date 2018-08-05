package trees;

public class BSTImplementation {
	class Node {
		Node left, right;
		int data;

		Node(int val) {
			this.data = val;
		}

		Node root;

		public void insert(Node root, int val) {
			if (val <= root.data) {
				if (root.left == null) {
					root.left = new Node(val);
				} else {
					root.left.insert(root, val);
				}
			} else {
				if (root.right == null) {
					root.right = new Node(val);
				} else {
					root.right.insert(root, val);
				}
			}
		}

		public boolean contains(Node root, int val) {
			if (val == root.data) {
				return true;
			} else if (val < root.data) {
				if (root.left == null) {
					return false;
				} else {
					root.left.contains(root, val);
				}
			} else {
				if (root.right == null) {
					return false;
				} else {
					root.right.contains(root, val);
				}
			}
			return false;
		}

		public void printInOrder() {
			if (root.left != null) {
				root.left.printInOrder();
			}

			System.out.println(root.data);

			if (root.right != null) {
				root.right.printInOrder();
			}
		}

		public void printPreOrder() {
			System.out.println(root.data);

			if (root.left != null) {
				root.left.printInOrder();
			}

			if (root.right != null) {
				root.right.printInOrder();
			}
		}

		public void printPostOrder() {
			if (root.left != null) {
				root.left.printInOrder();
			}

			if (root.right != null) {
				root.right.printInOrder();
			}

			System.out.println(root.data);
		}

	}
}
