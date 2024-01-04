package Lec_23;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Queue_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
		System.out.println(Q);
		System.out.println(Q.poll());
		System.out.println(Q);
	}

	public static void Rev(Queue<Integer> Q) {
		Stack<Integer> S = new Stack<>();
		while (!Q.isEmpty()) {
			S.add(Q.poll());
		}
		while (!S.isEmpty()) {
			Q.add(S.pop());
		}
	}

	public static void FirstNegWinK(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i);
			}
		}
		System.out.println(arr[Q.peek()]);
		for (int s = 1; s <= arr.length - k; s++) {
			if(!Q.isEmpty()&& Q.peek()==s-1) {
				Q.poll();
			}
			int e = s+k-1;
			if(arr[e]<0) {
				Q.add(e);
			}
			System.out.println(arr[Q.peek()]);	
		}
	}
}
