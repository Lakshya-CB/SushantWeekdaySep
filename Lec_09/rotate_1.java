package Lec_09;

public class rotate_1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);

		System.out.println("===========");
		rotate(arr, 12);
		System.out.println("===========");
		print(arr);

	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		for (int r = 0; r < rot; r++) {
			int jeb = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = jeb;

			print(arr);
		}
	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

}
