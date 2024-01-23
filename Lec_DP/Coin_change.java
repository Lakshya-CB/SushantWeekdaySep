package Lec_DP;

public class Coin_change {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 3};
		int A = 4;
		System.out.println(ways(0, A, coins, new Integer[coins.length][A + 1]));
		System.out.println(BU(coins, A));
	}

	public static int ways(int idx, int A, int[] coins, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		if (dp[idx][A] != null) {
			return dp[idx][A];
		}
		int sp1 = ways(idx, A - coins[idx], coins, dp);
		int sp2 = ways(idx + 1, A, coins, dp);
		dp[idx][A] = sp1 + sp2;
		return sp1 + sp2;
	}
//	int[] coins = { 1, 2, 3};
//	int A = 4;
	public static int BU(int[] coins, int Amount) {
		int[][] dp = new int[coins.length + 1][Amount + 1];
		for (int idx = coins.length - 1; idx >= 0; idx--) {
			for (int A = 0; A <= Amount; A++) {
//				dp[idx][A]!!

				if (A == 0) {
					dp[idx][A] = 1;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[idx][A - coins[idx]];
				}
				int sp2 = dp[idx + 1][A];
				dp[idx][A] = sp1 + sp2;

			}
		}
		return dp[0][Amount];
	}
}
