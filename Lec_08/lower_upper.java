package Lec_08;

import java.util.Scanner;

public class lower_upper {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		char ch = scn.next().charAt(1);
		System.out.println(ch);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lower");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("upper");
		} else {
			System.out.println("pta nahi");
		}
	}
}
