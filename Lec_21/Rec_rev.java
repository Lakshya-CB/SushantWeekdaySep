package Lec_21;

import java.util.Scanner;

public class Rec_rev {
	static int cnt = 0;

	public static void main(String[] args) {
//		System.out.println(Fact(4));
		Scanner scn = new Scanner(System.in);
//		SS(scn.next(), "");
		SSAscii(scn.next(), "");
		System.out.println(cnt);
	}

	public static void SS(String frens, String team) {
		if (frens.isEmpty()) {
			System.out.println(team);
			cnt++;
			return;
		}
//		BP =>"abcd"
//		SP => "bcd"
		String sp = frens.substring(1);
		char ch = frens.charAt(0);
		SS(sp, team + ch);
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

	public static void SSAscii(String frens, String team) {
		if (frens.isEmpty()) {
			System.out.println(team);
			cnt++;
			return;
		}
		String sp = frens.substring(1);
		char ch = frens.charAt(0);
		SSAscii(sp, team);
		SSAscii(sp, team + ch);
		SSAscii(sp, team + (int)ch);

	}
}
