package Lec_09;

public class array_demo_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int cnt = 5;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = cnt;
//			cnt = cnt + 5;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println("===");
		for(int element: arr) { // for each / Enhanced
//			System.out.println(element);
			element = 99;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
