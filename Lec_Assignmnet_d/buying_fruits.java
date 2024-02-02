package Lec_Assignmnet_d;

import java.util.Scanner;

public class buying_fruits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			int[][] shops = new int[scn.nextInt()][3];
			for (int i = 0; i < shops.length; i++) {
				for (int c = 0; c < 3; c++) {
					shops[i][c] = scn.nextInt();
				}

			}
//			System.out.println(solve(0, 3, shops, new Integer[shops.length][4]));
			System.out.println(BU(shops));
		}
	}

	public static int solve(int curr, int prev, int[][] shops, Integer[][] dp) {
		if (curr == shops.length) {
			return 0;
		}
		if (dp[curr][prev] != null) {
			return dp[curr][prev];
		}
		int sp1 = Integer.MAX_VALUE;
		int sp2 = Integer.MAX_VALUE;
		int sp3 = Integer.MAX_VALUE;
		if (prev != 0) {
			sp1 = shops[curr][0] + solve(curr + 1, 0, shops, dp);
		}
		if (prev != 1) {
			sp2 = shops[curr][1] + solve(curr + 1, 1, shops, dp);
		}
		if (prev != 2) {
			sp3 = shops[curr][2] + solve(curr + 1, 2, shops, dp);
		}
		dp[curr][prev] = Math.min(sp3, Math.min(sp1, sp2));
		return Math.min(sp3, Math.min(sp1, sp2));
	}

	public static int BU(int[][] shops) {
		int[][] dp = new int[shops.length + 1][4];
		for (int curr = shops.length - 1; curr >= 0; curr--) {
			for (int prev = 0; prev < 3; prev++) {
//				dp[curr][prev]!!
				int sp1 = Integer.MAX_VALUE;
				int sp2 = Integer.MAX_VALUE;
				int sp3 = Integer.MAX_VALUE;
				if (prev != 0) {
					sp1 = shops[curr][0] + dp[curr + 1][0];
				}
				if (prev != 1) {
					sp2 = shops[curr][1] + dp[curr + 1][1];
				}
				if (prev != 2) {
					sp3 = shops[curr][2] + dp[curr + 1][2];
				}
				dp[curr][prev] = Math.min(sp3, Math.min(sp1, sp2));

			}
		}
		return Math.min(dp[0][0], Math.min(dp[0][1], dp[0][2]));
	}
}
