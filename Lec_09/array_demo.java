package Lec_09;

public class array_demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);
		
		System.out.println(arr.length); // size
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[arr.length-1]);
//		System.out.println(arr[-1]);
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
		
		
	}
}
