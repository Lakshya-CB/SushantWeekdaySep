package Lec_HM_Bit_Trie;

import java.util.ArrayList;

public class HashMap<KK, VV> {
	class Node {
		public Node(KK k, VV v) {
			// TODO Auto-generated constructor stub
			key = k;
			val = v;
		}

		KK key;
		VV val;
		Node next;
	}

	int size = 0;
	ArrayList<Node> Buckets;

	public HashMap() {
		Buckets = new ArrayList<>();
//		default num of Buckets = 4!!
//		default load factor!! threshold =2
		for (int cnt = 0; cnt < 4; cnt++) {
			Buckets.add(null);
		}
	}

	public int HashingFn(KK Key) {
		int i = Key.hashCode();
		int ans = i % Buckets.size();
		if (ans < 0) {
			ans = ans + Buckets.size();
		}
		return ans;
	}

	public void put(KK K, VV V) {
		int bucketNum = HashingFn(K);
		Node head = Buckets.get(bucketNum);
		Node nn = head;
		while (nn != null) {
			if (nn.key.equals(K)) {
				nn.val = V;
				return;
			}
			nn = nn.next;
		}
		nn = new Node(K, V);
		nn.next = head;
		size++;
		Buckets.set(bucketNum, nn);
		/////////////////
//		if current load > loadfactor!! rehash!!
		double currLoad = (1.0 * size) / Buckets.size();
		if (currLoad > 2) {
			reHash();
		}

	}

	private void reHash() {
		ArrayList<Node> Biggy = new ArrayList<>();
		for (int cnt = 1; cnt <= Buckets.size() * 2; cnt++) {
			Biggy.add(null);
		}
		ArrayList<Node> Old = Buckets;
		Buckets = Biggy;
		size = 0;
		for (Node head : Old) {
			Node nn = head;
			while (nn != null) {
				put(nn.key, nn.val);
				nn = nn.next;
			}
		}

	}

	@Override
	public String toString() {
		String ans = "";
		for (Node head : Buckets) {
			Node nn = head;
			while (nn != null) {
				ans = ans + "{" + nn.key + "=>" + nn.val + "}";
				nn = nn.next;
			}
		}
		return ans;
	}

	public VV get(KK K) {
		int bucketNum = HashingFn(K);
		Node head = Buckets.get(bucketNum);
		Node nn = head;
		while (nn != null) {
			if (nn.key.equals(K)) {
				return nn.val;
			}
			nn = nn.next;
		}
		return null;
	}
}
