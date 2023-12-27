package Lec_20;

import java.util.ArrayList;
import java.util.Scanner;

public class diag_traversal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		print(arr);

	}

	public static void print(int[][] arr) {
		int rs = 0;
		int cs = 0;
		int cnt = 0;
		while (rs < arr.length) {
//			System.out.println(rs + " - " + cs);
			ArrayList<Integer> AL = new ArrayList<>();
			int r = rs;
			int c = cs;
			while (c >= 0 && r < arr.length) {
//				System.out.print(arr[r][c]+" ");
				AL.add(arr[r][c]);
				r++;
				c--;
			}
			if (cnt % 2 == 0) {
				for (int i = 0; i < AL.size(); i++) {
					System.out.print(AL.get(i) + " ");
				}
			} else {
				for (int i = AL.size() - 1; i >= 0; i--) {
					System.out.print(AL.get(i) + " ");
				}
			}
			if (cs == arr[0].length - 1) {
				rs++;
			} else {
				cs++;
			}
			cnt++;

		}
	}
}
