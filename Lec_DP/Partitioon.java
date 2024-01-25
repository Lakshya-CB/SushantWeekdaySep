package Lec_DP;

public class Partitioon {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 9 };
		int k = 3;
		System.out.println(solve(0, k, arr, ""));
	}

	public static int solve(int idx, int k, int[] arr, String path) {
		if (k == 0) {
			System.out.println(path);
			return 0;
		}
		if (idx >= arr.length) {
			System.out.println("-=-=-" + path);
			return 0;
		}
		int sum = arr[idx];
		int ans = sum;
		for (int e = idx + 1; e <= arr.length - (k - 1); e++) {
//			e is exclusive!! next piece starts from e
//			current piece is form idx to e-1;
			int sp = sum / (e - idx) + solve(e, k - 1, arr, path + "{" + idx + "," + (e - 1) +"=>"+(sum / (e - idx))+ "}");
			if (e < arr.length) {
				sum = sum + arr[e];
			}
			ans = Math.max(ans, sp);
		}
		return ans;
	}
}
