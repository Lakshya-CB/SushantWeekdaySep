package Lec_Recursion;

public class rec_arr_basic {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
//		print(1, arr);
//		print2(arr.length - 1, arr);
//		print3(0, arr.length - 1, arr);
		Rev(0, arr);
	}

	public static void print(int s, int[] arr) {
		if (s == arr.length) {
			return;
		}
//		bp : p(0,4);
//		sp : p(1,3)
		System.out.println(arr[s]);
		print(s + 1, arr);
	}

	public static void print2(int e, int[] arr) {
		if (e < 0) {
			return;
		}
//		BP=>(e,arr) from 0 to e sare!!
//		SP=>(e-1,arr)
		print2(e - 1, arr);
		System.out.println(arr[e]);
	}

	public static void print3(int s, int e, int[] arr) {
		if (e < s) {
			return;
		}
		int mid = (s + e) / 2;

		print3(s, mid - 1, arr);
		System.out.println(arr[mid]);
		print3(mid + 1, e, arr);
	}

	public static void Rev(int s, int[] arr) {
		if(s==arr.length) {
			return;
		}
//		BP : Rev(s,arr)
//		Sp : REv(s+1,arr)
		
		Rev(s+1,arr);
		System.out.println(arr[s]);
	}
	public static int Fact(int n ) {
		if(n<=1) {
			return 1;
		}
//		BP : n!
//		SP : n-1!
		int sp = Fact(n-1);
		return sp*n;
	}
}
