package Lec_random_doubts;

import java.util.Arrays;
import java.util.Stack;

public class Pat_132 {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 2 };
		solve(arr);
	}

	public static boolean solve(int[] arr) {
		int[] Min_i = new int[arr.length];
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < arr.length; j++) {
			Min_i[j] = min;
			min = Math.min(arr[j], min);
		}
		System.out.println(Arrays.toString(Min_i));
		Stack<Integer> S = new Stack<>();
		for (int j = arr.length - 1; j >= 0; j--) {
//			bhai mere J, bata tu kis kiska next greater hain
//			bhai mere J, apne K bata;
			while (!S.isEmpty() && arr[S.peek()] < arr[j]) {
//				arr[J] is the next greater of S.peek()
				int k = S.pop();
//				bhai mere tera K bhi hain and J bhi hein!!
//				i just need to check ki bhai arr[k]
				System.out.println(arr[k] + " => " + arr[j] + " => " + Min_i[j]);
				if (arr[k] > Min_i[j]) {
					return true;
				}
			}
			S.add(j);
		}

		return false;
	}
}
