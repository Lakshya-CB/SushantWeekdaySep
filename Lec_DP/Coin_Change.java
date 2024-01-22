package Lec_DP;

public class Coin_Change {
	public static void main(String[] args) {
		int[] coins = {2,3,4};
		int A = 10;
		System.out.println(ways(0, A, coins));
	}

	public static int ways(int idx, int A, int[] coins) {
		if(A==0) {
			return 1;
		}
		if(A<0 ||idx==coins.length) {
			return 0;
		}
		int sp1 = ways(idx, A - coins[idx], coins);
		int sp2 = ways(idx + 1, A, coins);
		return sp1 + sp2;
	}
}
