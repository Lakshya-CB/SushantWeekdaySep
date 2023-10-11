package Lec_10;

public class rotate_2 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		print(arr);
		System.out.println("===========");
		rotate(arr, 12);
//		rev(0, arr.length - 1, arr);
		System.out.println("===========");
		print(arr);

	}

	public static void rev(int i, int j, int[] arr) {
//			int i =0;
//			int j = arr.length-1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		rev(0, arr.length - 1, arr);
		print(arr);
		rev(0, rot - 1, arr);
		print(arr);
		rev(rot, arr.length - 1, arr);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

}
