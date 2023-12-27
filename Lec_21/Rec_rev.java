package Lec_21;

import java.util.Scanner;

public class Rec_rev {

	public static void main(String[] args) {
//		System.out.println(Fact(4));
		Scanner scn = new Scanner(System.in);
		SS(scn.next(),"");
	}

	public static void SS(String frens, String team) {
		if(frens.isEmpty()) {
			System.out.println(team);
			return;
		}
//		BP =>"abcd"
//		SP => "bcd"
		String sp = frens.substring(1);
		char ch = frens.charAt(0);
		SS(sp, team+ch);
		SS(sp, team);
		
	}

	public static int Fact(int n) {
		if (n <= 1) {
			return 1;
		}
//		BP : n!
//		SP : n-1!
		int sp = Fact(n - 1);
		return sp * n;
	}
}
