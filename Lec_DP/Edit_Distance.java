package Lec_DP;

public class Edit_Distance {
	public static void main(String[] args) {

	}

	public static int solve(int idx1, int idx2, String str1, String str2,Integer[][] dp) {
		if (idx1 == str1.length()) {
			int str2_l = str2.length() - idx2;
			return str2_l;
		}
		if (idx2 == str2.length()) {
			int str1_l = str1.length() - idx1;
			return str1_l;
		}
		if(dp[idx1][idx2]!=null) {
			return dp[idx1][idx2];
		}
		if (str1.charAt(idx1) == str2.charAt(idx2)) {
			dp[idx1][idx2]=  solve(idx1 + 1, idx2 + 1, str1, str2,dp);
			return dp[idx1][idx2];
		} else {
			int D = solve(idx1 + 1, idx2, str1, str2,dp);
			int R = solve(idx1 + 1, idx2 + 1, str1, str2,dp);
			int I = solve(idx1, idx2 + 1, str1, str2,dp);
			dp[idx1][idx2]= 1 + Math.min(D, Math.min(R, I));
			return dp[idx1][idx2];
		}
	}
}
