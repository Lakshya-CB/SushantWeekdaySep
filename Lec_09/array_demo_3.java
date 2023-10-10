package Lec_09;

public class array_demo_3 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 60 };
		int[] arr1 = arr;

		arr1[0] = 99;
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
	}
}
