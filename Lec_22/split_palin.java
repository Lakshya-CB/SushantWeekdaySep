package Lec_22;

import java.util.Scanner;

public class split_palin {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();

		for (int chakku = 1; chakku <= str1.length(); chakku++) {
			String pre1 = str1.substring(0, chakku);
			String suff1 = str1.substring(chakku);
			
			String pre2 = str2.substring(0, chakku);
			String suff2 = str2.substring(chakku);
			if(isPlain(pre1+suff2)||isPlain(pre2+suff1)) {
				System.out.println(true);
				return;
			}
		}
		System.out.println("false");
	}

	private static boolean isPlain(String str) {
		int s =0;
		int e = str.length()-1;
		while(s<e) {
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
			s++;e--;
		}
		return true;
	}
}
