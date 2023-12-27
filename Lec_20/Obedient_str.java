package Lec_20;

import java.util.Scanner;

public class Obedient_str {
	static boolean ans = false;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		genrate(str, "a");
//		if()
		System.out.println(ans);
	}

	public static void genrate(String orignal, String curr) {
		if(!orignal.startsWith(curr)) {
			return;
		}
		if(orignal.equals(curr)) {
			ans = true;
//			System.out.println(true);
			return;
		}
		if (curr.endsWith("a")) {
			genrate(orignal, curr + "a");
			genrate(orignal, curr + "bb");
		} else if (curr.endsWith("bb")) {
			genrate(orignal, curr + "a");
		}
	}
}
