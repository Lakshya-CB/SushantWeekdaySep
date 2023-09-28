package Lec_02;

import java.util.Scanner;

public class isPrime {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		int div = 1;
		int numOfFac = 0;
		while (div <= n) {
			int R = n % div;
			System.out.println(div + " - " + R);
			if (R == 0) {
				numOfFac = numOfFac + 1;
			}
			div = div + 1;
		}
		System.out.println(numOfFac);
		if (numOfFac == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}
	}
}
