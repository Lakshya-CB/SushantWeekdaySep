package Lec_12;

public class array_product_self {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		solve(arr);
	}

	public static void solve(int[] arr) {
		int LeftP = 1;
		for (int i = 0; i < arr.length; i++) {
			int RightP = 1;
			for (int R = i + 1; R < arr.length; R++) {
				RightP = RightP * arr[R];
			}
			System.out.println(LeftP * RightP);
			LeftP = LeftP * arr[i];

		}
	}

	public static void solve2(int[] arr) {
		int LeftP = 1;
		int RightP = 1;
		int[] RP_arr = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			RP_arr[i] = RightP;
			RightP = RightP * arr[i];
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println(LeftP * RP_arr[i]);
			LeftP = LeftP * arr[i];

		}
	}

	public int trap(int[] arr) {
		int L = 0;
		int R = arr.length - 1;
		int LWall = arr[0];
		int RWall = arr[arr.length - 1];

		int total_paani = 0;
		while (L <= R) {
			if (LWall <= RWall) {
				int paani = Math.max(0, LWall - arr[L]);
				total_paani = total_paani + paani;
				LWall = Math.max(LWall, arr[L]);
				L++;
			} else {

				int paani = Math.max(0,  RWall - arr[R]);
				total_paani = total_paani + paani;
				RWall = Math.max(RWall, arr[R]);
				R--;
			}
		}
		return total_paani;
	}
}
