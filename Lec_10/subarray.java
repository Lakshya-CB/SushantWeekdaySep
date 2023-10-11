package Lec_10;

public class subarray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -1, 30, 40 };
		MaxSumarraySum(arr);

	}

	public static void Maxsum0(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
				int sum = 0;
				for (int i = s; i <= e; i++) {
					System.out.print(arr[i] + " ");
					sum = sum + arr[i];
				}
				System.out.println("=>" + sum);
			}
		}
	}

	public static void MaxSumarraySum(int[] arr) {
//		int sum = 0; //A
		for (int s = 0; s < arr.length; s++) {
			int sum = 0; // B
			for (int e = s; e < arr.length; e++) {
//				int sum = 0; //C
				sum = sum + arr[e];

				System.out.println(sum);
			}
		}
	}

	public static int MaxSubarraySum(int[] arr) {
		int sum = 0;
		int ans = Integer.MIN_VALUE;
		for (int ali : arr) {
			sum = sum + ali;
			if (sum > ans) {
				ans = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
			
//			sum = Math.max(sum, 0);
//			ans = Math.max(ans, sum);
		}
		return ans;
	}
}
