package Lec_DP;

public class House_Rob {
	public static void main(String[] args) {
		int[] houses = { 2, 7, 9, 3, 1 };
		int ans = chori_kar(0, houses, new Integer[houses.length]);
		System.out.println(ans);
	}

	public static int chori_kar(int idx, int[] houses, Integer[] dp) {
//			Bp : 0 se last
//		SP : just think about that single house!!
		if (idx >= houses.length) {
			return 0;
		}
		if(dp[idx]!=null) {
			return dp[idx];
		}
		int sp1 = houses[idx] + chori_kar(idx + 2, houses, dp); // rob the idx
		int sp2 = chori_kar(idx + 1, houses, dp); // skip
		dp[idx] = Math.max(sp1, sp2); // storing!!
		return Math.max(sp1, sp2);
	}
	public static int chori_kar(int[]houses){
		int[] dp = new int[houses.length+2];
		
		for(int idx = houses.length-1;idx>=0;idx--) {
//			dp[idx]
			if (idx >= houses.length) {
				return 0;
			}
			
			int sp1 = houses[idx] + dp[idx + 2]; // rob the idx
			int sp2 = dp[idx + 1]; // skip
			dp[idx] = Math.max(sp1, sp2); // storing!!
			
		}
		return dp[0];
	}
}
