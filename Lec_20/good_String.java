package Lec_20;

import java.util.Scanner;

public class good_String {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(solve(scn.next()));
		
	}

	public static int solve(String str) {
		int ans =0;
		int score = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (isVowel(ch)==true) {
				score++;
			} else {
				score = 0;
			}
			ans = Math.max(ans, score);
		}
		return ans;
	}

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else {
			return false;
		}
	}
}
