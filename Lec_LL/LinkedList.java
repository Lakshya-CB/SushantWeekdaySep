package Lec_LL;

import java.util.Stack;

public class LinkedList {
	class Node {
		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		Node temp = head;
		int cnt = 0;
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int get(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("out of bounds");
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("out of bounds");
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("no ele in LL");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("no ele in LL");
		}
//		return get(size()-1);
		Node temp = head;
		int cnt = 0;
		while (temp.next != null) {
			cnt++;
			temp = temp.next;
		}
		return temp.data;
	}

	public void addFirst(int ali) {
//		Node nn = new Node();
//		nn.data = ali;
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addLast(int ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node last = getNodeAt(size() - 1);
		Node nn = new Node(ali);
		last.next = nn;
	}

	public void addAt(int idx, int ali) {
		if (idx == 0) {
			addFirst(ali);
			return;
		} else if (idx == size()) {
			addLast(ali);
			return;
		}
		if (idx < 0 || idx > size()) {
			throw new RuntimeException("out of bounds");
		}
		Node nn = new Node(ali);
		Node prev = getNodeAt(idx - 1);
		Node after = prev.next;

		nn.next = after;
		prev.next = nn;

	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("empty");
		}
		int data = head.data;
		head = head.next;
		return data;
	}

	public int removeLast() {
		if (size() == 0 || size() == 1) {
			return removeFirst();
		}
		Node secondLast = getNodeAt(size() - 2);
		Node Last = secondLast.next;
		secondLast.next = null;
		return Last.data;
	}

	public int removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		} else if (idx >= size() || idx < 0) {
			throw new RuntimeException("?");
		}
		Node prev = getNodeAt(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;

		prev.next = after;

		return curr.data;
	}

	public void add(int ali) {
		addLast(ali);
	}

	public void Rev() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node after = curr.next;
			///
			curr.next = prev;
			///
			prev = curr;
			curr = after;
		}
		head = prev;
	}

	public void Rev2() {
		// TODO Auto-generated method stub
		Rev2(head);
	}

	private Node Rev2(Node nn) {
		if (nn.next == null) {
			head = nn;
			return nn;
		}
		Node Tail = Rev2(nn.next);
		Tail.next = nn;
		nn.next = null;
		return nn;
	}

	public void revK(int k) {
		head = revK(head, k);
	}

	private Node revK(Node nn, int k) {
		if (nn == null) {
			return null;
		}
		Node temp = nn;
		for (int i = 0; i < k; i++) {
			if (temp == null) {
				return nn;
			}
			temp = temp.next;
		}
		Node head = revK(temp, k);

		Node curr = nn;
		Node prev = null;
		for (int i = 0; i < k; i++) {
			Node after = curr.next;
//			System.out.println(curr.data);
			curr.next = prev;
			prev = curr;
			curr = after;
		}
		nn.next = head;
		return prev;
	}

	public void revK_Iter(int k) {
		Node nhead = null;
		Node ntail = null;
		
		
		Stack<Node> S = new Stack<>();
		Node curr = head;

		while (curr != null) {
			Node after = curr.next;
//			System.out.println("!>?<!?>!?>");
			S.add(curr);
			if (S.size() == k) {
//				Empty my stack and 
//				insert all the Nodes in the new LL
				while(!S.isEmpty()) {
					Node nn = S.pop();
//					 this nn needs to be inserted at the end of
//					my LL
					if(nhead==null) {
						nhead = nn;
						ntail = nn;
						ntail.next = null;
					}else {
						ntail.next = nn;
						ntail = nn;
						ntail.next = null;
					}
				}
				
			}
			curr = after;
		}
		head = nhead;

	}

}
