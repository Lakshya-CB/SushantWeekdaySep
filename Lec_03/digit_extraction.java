package Lec_03;

public class digit_extraction {
	public static void main(String[] args) {
		int num = 12345;
		int ans = 0;
		while (num>0) {
			int digit = num % 10;
//			System.out.print(digit);
			ans = ans*10+digit;
			int Q = num / 10;
			num = Q;
		}
		System.out.println(ans);
	}
}
