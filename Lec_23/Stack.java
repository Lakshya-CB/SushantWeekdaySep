package Lec_23;

public class Stack {
	int[] arr;
	int top;

	public Stack(int cap) {
		arr = new int[cap];
		top = -1;
	}

	public Stack() {
		this(5);
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top + 1;
	}

	public boolean isFull() {
		return arr.length == size();
	}

	public void add(int ali) {
		if (isFull()) {
			throw new RuntimeException("bhai kya daal rha hein?!");
		}
		top++;
		arr[top] = ali;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein?!");
		}
		return arr[top];
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("kya nikaal rha hein");
		}
		int ans = arr[top];
		top--;
		return ans;
	}

	public void print() {
		System.out.print("[");
		int i = 0;
		for (;;) {
			if (i < top) {
				System.out.print(arr[i] + ", ");
			} else if (i == top) {
				System.out.print(arr[i]);
			} else {
				System.out.println("]");
				break;
			}
			i++;
		}
	}
}
