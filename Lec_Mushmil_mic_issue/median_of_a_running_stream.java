package Lec_Mushmil_mic_issue;

import java.util.Collections;
import java.util.PriorityQueue;

public class median_of_a_running_stream {
	public static void main(String[] args) {

	}

	public static void solve(int[] arr) {
		PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> Right = new PriorityQueue<>();
		for (int ali : arr) {
			if (Left.isEmpty() || ali < Left.peek()) {
				Left.add(ali);
			} else {
				Right.add(ali);
			}
//			if not balance !!
			if (Left.size() - Right.size() > 1) {
				Right.add(Left.poll());
			}
			if (Right.size() - Left.size() > 1) {
				Left.add(Right.poll());
			}
			/////////////
			if (Left.size() == Right.size()) {
				System.out.println((Left.peek() + Right.peek()) / 2);
			} else if(Left.size()> Right.size()) {
				System.out.println(Left.peek());
			}else {
				System.out.println(Right.peek());
			}
		}
//		n log n
	}

}
