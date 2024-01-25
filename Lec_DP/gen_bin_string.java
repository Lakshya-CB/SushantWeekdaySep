package Lec_DP;

public class gen_bin_string {
	public static void main(String[] args) {
		int n = 5;
		solve(n,false, "");
	}

	public static void solve(int n, boolean b, String str) {
		if (n == 0) {
			System.out.println(str);
			return;
		}
		solve(n - 1, false, str + "0");
		if (b == false) {
			solve(n - 1, true, str + "1");
		}
	}
}
