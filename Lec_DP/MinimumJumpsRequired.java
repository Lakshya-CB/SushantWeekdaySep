package Lec_DP;

import java.util.Scanner;

public class MinimumJumpsRequired {
	public static void main(String[] args) {
//		int[] arr = { 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
//		System.out.println(kuud(0, arr));
//		System.out.println(Integer.MAX_VALUE+1);
		Scanner scn = new Scanner(System.in);
		int t= scn.nextInt();
		while(t>0) {
			t--;
			int[] arr = new int[scn.nextInt()];
			for(int i=0;i<arr.length;i++) {
				arr[i]= scn.nextInt();
			}
			System.out.println(kuud(t, arr, new Integer[arr.length]));
		
		}
	}

	public static int kuud(int idx, int[] arr,Integer[] dp) {
		if (idx >= arr.length) {
//			System.out.println(path);
			return 0;
		}
		if(dp[idx]!=null) {
			return dp[idx];
		}
		int ans = Integer.MAX_VALUE;
		for (int jump = 1; jump <= arr[idx]; jump++) {
			int sp = kuud(idx + jump, arr,dp);
			ans = Math.min(ans, sp);
		}
		
		if (ans == Integer.MAX_VALUE) {
			dp[idx] = ans;
			return ans;
		} else {
			dp[idx] = ans+1;
			return ans + 1;
		}
	}
//	public static void kuud(int idx, String path, int[] arr) {
//		if (idx >= arr.length) {
//			System.out.println(path);
//			return;
//		}
//
//		for (int jump = 1; jump <= arr[idx]; jump++) {
//			kuud(idx + jump, path + jump, arr);
//		}
//	}
}
