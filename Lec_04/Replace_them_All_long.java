package Lec_04;

import java.util.Scanner;

public class Replace_them_All_long {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		
//		System.out.println(num);
		long ans = 0;
		long mult= 1;
		while(num>0) {
			long digit = num%10;
			if(digit>=5) {
				digit = 5;
			}
			ans = ans + digit*mult;
			
//			System.out.println(digit);
			num = num/10;
			mult = mult*10;
		}
		if(ans==0) {
			ans = 5;
		}
		System.out.println(ans);
	}
}
