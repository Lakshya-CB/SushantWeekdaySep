package Lec_23;

public class Queue {
	int[] arr;
	int s = 0;
	int size = 0;

	public Queue(int cap) {
		arr = new int[cap];
	}
	public Queue() {
		this(5);
	}
	public void add(int ali) {
		int idx= (s+size)%arr.length;
		arr[idx] = ali;
		size++;
	}
	public int poll() {
		int ans = arr[s];
		s++;
		size--;
		return ans;
	}
}
