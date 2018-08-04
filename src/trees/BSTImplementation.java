package trees;

public class BSTImplementation {
	class Node {
		Node left, right;
		int data;

		Node(int val) {
			this.data = val;
		}

		public void insert(int val) {
			if (val <= data) {
				if (left == null) {
					left = new Node(val);
				} else {
					left.insert(val);
				}
			} else {
				if (right == null) {
					right = new Node(val);
				} else {
					right.insert(val);
				}
			}
		}
		
		public boolean contains(int val) {
			if(val == data) {
				return true;
			}else if(val < data) {
				if(left == null) {
					return false;
				}else {
					left.contains(val);
				}	
			}else {
				if(right == null) {
					return false;
				}else {
					right.contains(val);
				}	
			}
			return false;
		}
	}
}
