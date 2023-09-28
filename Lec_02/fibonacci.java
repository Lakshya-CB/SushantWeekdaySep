package Lec_02;

public class fibonacci {
	public static void main(String[] args) {
		int n = 5;

		int a = 0;
		int b = 1;
		int c = -1;
		int cnt = 1;
		while (cnt <= n) {
			c = a + b;
//			System.out.println(c);
			a = b;
			b = c;

			cnt = cnt + 1;
		}
		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		

	}
}
