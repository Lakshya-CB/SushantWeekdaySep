package Lec_LL;

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
			System.out.println(temp.data);
			temp = temp.next;
		}
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
		Node nn = new Node(50);
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

	public void Rev() {

	}
}
