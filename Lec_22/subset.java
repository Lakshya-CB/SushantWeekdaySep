package Lec_22;

import java.util.Scanner;

public class subset {
	public static void main(String[] args) {
//		Scanner scn = new Scane
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		solve(0, k, "", arr);

	}

	public static void solve(int idx, int k, String path, int[] arr) {
		if (k == 0) {
			System.out.println(path);
			return;
		}
		if (k < 0 || idx == arr.length) {
			return;
		}
		solve(idx + 1, k, path, arr);

		solve(idx + 1, k - arr[idx], arr[idx] + " " + path, arr);

	}
}
