package Lec_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
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

	public void print() {
		print(root);
	}

	private void print(Node nn) {
//		BP => 10k!!
		if (nn == null) {
			return;
		}
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "=>" + nn.data + "<=";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
		print(nn.left);
		print(nn.right);

	}

	public BinaryTree(int[] pre, int[] in) {
		root = createInPre(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node createInPre(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		int f = -1;
		int Left_size = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == nn.data) {
				f = i;
				break;
			}
			Left_size++;
		}
		nn.left = createInPre(pre, ps + 1, ps + Left_size, in, is, f - 1);
		nn.right = createInPre(pre, ps + Left_size + 1, pe, in, f + 1, ie);
		return nn;
	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = size(nn.left);
		int R = size(nn.right);
		return L + R + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	int global_dia = 0;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);
		int self_Dia = L + R + 2;
		global_dia = Math.max(global_dia, self_Dia);
		return Math.max(L, R) + 1;
	}

	public int Dia() {
		return Dia(root);
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int self_Dia = 2 + Ht(nn.left) + Ht(nn.right);
		return Math.max(self_Dia, Math.max(L, R));
	}

	class HtDiaP {
		int Ht = -1;
		int Dia = 0;
	}

	private HtDiaP Dia2(Node nn) {
		if (nn == null) {
			return new HtDiaP();
		}
		HtDiaP L = Dia2(nn.left);
		HtDiaP R = Dia2(nn.right);

		HtDiaP ans = new HtDiaP();
//		ht!!
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
//		
		int self_Dia = L.Ht + R.Ht + 2;
		ans.Dia = Math.max(self_Dia, Math.max(L.Dia, R.Dia));
		return ans;

	}

	public boolean isBal() {
		return isBal2(root).isBal;
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);
		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;
		return L && R && self;
	}

	class BalHt_Pair {
		int Ht = -1;
		boolean isBal = true;
	}

	private BalHt_Pair isBal2(Node nn) {
		if (nn == null) {
			return new BalHt_Pair();
		}
		BalHt_Pair L = isBal2(nn.left);
		BalHt_Pair R = isBal2(nn.right);

		BalHt_Pair ans = new BalHt_Pair();
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
/////////////////////////

		boolean self = Math.abs(L.Ht - R.Ht) <= 1;
		ans.isBal = L.isBal && R.isBal && self;
		return ans;
	}

	public BinaryTree(int[] pre) {
		root = createPre(pre);
	}

	private Node createPre(int[] pre) {
		if (p_idx >= pre.length || pre[p_idx] == -1) {
			p_idx++;
			return null;
		}
		Node nn = new Node(pre[p_idx]);
		p_idx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}

	int p_idx = 0;

	public void lvlPrint() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			System.out.println(nn.data);
			if (nn.left != null) {
				Q.add(nn.left);
			}
			if (nn.right != null) {
				Q.add(nn.right);
			}
		}
	}

	public void lvlPrint2() {
		Queue<Node> currQ = new LinkedList<>();
		Queue<Node> nextQ = new LinkedList<>();

		currQ.add(root);
		while (!currQ.isEmpty()) {
			Node nn = currQ.poll();
			System.out.print(nn.data + " ");
			if (nn.left != null) {
				nextQ.add(nn.left);
			}
			if (nn.right != null) {
				nextQ.add(nn.right);
			}
			if (currQ.isEmpty()) {
				System.out.println();
				currQ = nextQ;
				nextQ = new LinkedList<>();
			}
		}
	}

	public void lvlPrint3() {
		Queue<Node> currQ = new LinkedList<>();
		int curr_size = 1;
		currQ.add(root);
		while (!currQ.isEmpty()) {
			for (int i = 0; i < curr_size; i++) {
				Node nn = currQ.poll();
				System.out.print(nn.data + " ");
				if (nn.left != null) {
					currQ.add(nn.left);
				}
				if (nn.right != null) {
					currQ.add(nn.right);
				}
			}
			curr_size = currQ.size();
			System.out.println();

		}
	}

	public BinaryTree(int[] lvl, boolean b) {
		root = createLvl(lvl);
	}

	private Node createLvl(int[] lvl) {
		Node nn = new Node(lvl[0]);
		int idx = 1;
		Queue<Node> Q = new LinkedList<>();
		Q.add(nn);
		while (!Q.isEmpty()) {
			Node curr = Q.poll();
			if (idx >= lvl.length || lvl[idx] != -1) {
				curr.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (idx >= lvl.length || lvl[idx] != -1) {
				curr.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;

		}
		return nn;
	}

}
