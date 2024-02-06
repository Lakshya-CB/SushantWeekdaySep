package Lec_37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

public class BinaryTree <T>{
	class Node {
		public Node(T i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		T data;
		Node left;
		Node right;
	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
//		System.out.println(nn.data);
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

	public BinaryTree(T[] lvl) {
		Queue<Node> Q = new LinkedList<>();
		root = new Node(lvl[0]);
		Q.add(root);
		int idx = 1;
		while (!Q.isEmpty() && idx < lvl.length) {
			Node nn = Q.poll();
			if (idx < lvl.length && lvl[idx] != null) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != null) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}
	}
}
