package Lec_23;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		int[] arr = 
			{ 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
//		nextGr8er(arr);
		nextGr8er2(arr);
	}

	public static void nextGr8er(int[] arr) {
		Stack<Integer> S = new Stack<Integer>(); // Potential A's
		for (int B : arr) {
//			tu kis kiska next greater hein!??
			while (!S.isEmpty() && S.peek() < B) {
				int A = S.pop();
				System.out.println(A + "=>" + B);
			}
			S.add(B);
		}

	}

	public static void nextGr8er2(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> S = new Stack<Integer>(); // Potential A's
		int i = 0;
		for (int B : arr) {

//			tu kis kiska next greater hein!??
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
				System.out.println(arr[A_idx] + "=>" + B);
			}
			S.add(i);
			i++;
		}
		System.out.println(Arrays.toString(ans));

	}
}
