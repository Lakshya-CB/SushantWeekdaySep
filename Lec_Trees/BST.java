package Lec_Trees;

public class BST {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;

	}

	Node root;

	public boolean find(int ali) {
		return find(root, ali);
	}

//	O(ht)
	private boolean find(Node nn, int ali) {
		if (nn == null) {
			return false;
		}
		if (nn.data == ali) {
			return true;

		} else if (nn.data < ali) {
			return find(nn.right, ali);
		} else {
			return find(nn.left, ali);
		}
	}

	public int Min() {
		return Min(root);
	}

	private int Min(Node nn) {
		if (nn.left == null) {
			return nn.data;
		}
		return Min(nn.left);
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if (nn.right == null) {
			return nn.data;
		}
		return Max(nn.right);
	}

	public boolean isBST() {
		return isBST(root);
	}

	private boolean isBST(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBST(nn.left);
		boolean R = isBST(nn.right);

		boolean self = Max(nn.left) < nn.data && nn.data < Min(nn.right);

		return L && R && self;
	}

	public void add(int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data < ali) {
			nn.right = add(nn.right, ali);
		} else {
			nn.left = add(nn.left, ali);
		}
		return nn;
	}

	public void remove(int ali) {
		root = remove(root, ali);
	}

	private Node remove(Node nn, int ali) {
		if (nn == null) {
			return null;
		}
		if (nn.data < ali) {
			nn.right = remove(nn.right, ali);
			return nn;
		} else if (nn.data > ali) {
			nn.left = remove(nn.left, ali);
			return nn;
		}else {
			if(nn.left == null && nn.right == null) {
				return null;
			}
			if(nn.left == null && nn.right != null) {
				return nn.right;
			}
			if(nn.left != null && nn.right == null) {
				return nn.left;
			}
			if(nn.left != null && nn.right!=null) {
//				replace nn with max of left || min or right
				nn.data = Min(nn.right);
				nn.right = remove(nn.right,nn.data);
				return nn;
			}
		}
		return nn;
	}
}
