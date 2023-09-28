package Lec_04;

public class inverse {
	public static void main(String[] args) {
//		System.out.println(9897^0);
		int num = 43512;
		int pos = 1;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
			System.out.println(digit + " - " + pos);
			int mult = (int) Math.pow(10, digit - 1);
			ans = ans + pos * mult;
			num = num / 10;
			pos++;
		}
		System.out.println(ans);
	}
}
