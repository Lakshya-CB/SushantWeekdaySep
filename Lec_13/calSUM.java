package Lec_13;

import java.util.Arrays;
import java.util.Scanner;

public class calSUM {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		arr = operation(arr, scn);

		int arrSum = 0;
		for (int element : arr) {
			arrSum += element;
		}
		int ans = (int) (arrSum % ((Math.pow(10, 9)) + 7));
		System.out.println(ans);
	}
	public static int[] operation(int[] arr, Scanner scn) {

		int total_Q = scn.nextInt();
		int sum =0;
		for (int cnt = 1;cnt<=total_Q;cnt++) {
			
		}
		return arr;
	}
}
