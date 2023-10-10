package Lec_09;

public class array_QPS {
	public static void main(String[] args) {
		int[] arr = { 10, 1, 31, 12, 7 };
		print(arr);
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static int max(int[] arr) {
		int jeb = Integer.MIN_VALUE;
		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}

		}
		return -1;
	}
}
