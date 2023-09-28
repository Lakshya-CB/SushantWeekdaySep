package Lec_04;

import java.util.Scanner;

public class chewbakka {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();

//		System.out.println(num);
		long ans = 0;
		long mult = 1;
		while (num > 0) {
			long digit = num % 10;
			if (num != 9 && digit >= 5) {
				digit = 9 - digit;
			}
			ans = ans + digit * mult;

//			System.out.println(digit);
			num = num / 10;
			mult = mult * 10;
		}

		System.out.println(ans);
	}
}
