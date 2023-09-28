package Lec_03;

public class GCD {
	public static void main(String[] args) {
		int a = 16;
		int b = 60;
		int divisor = a;
		int dividend = b;
		while (divisor > 0) {
			int R = dividend % divisor;
			dividend = divisor;
			divisor = R;
		}
//		System.out.println(R);
		System.out.println(dividend);
//		System.out.println(divisor);
	}
}
