package Lec_11;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_roses {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			int[] arr = new int[scn.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			int tar = scn.nextInt();
			solve(arr, tar);

		}
	}

	public static void solve(int[] arr, int target) {
		Arrays.sort(arr);
		int L = 0;
		int R = arr.length - 1;
		int L_rose = -1;
		int R_rose = -1;

		while (L < R) {
			if (arr[L] + arr[R] == target) {
				L_rose = arr[L];
				R_rose = arr[R];
				L++;
				R--;
			} else if (arr[L] + arr[R] > target) {
				R--;
			} else {
				L++;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + L_rose + " and " + R_rose + ".");
	}

}
