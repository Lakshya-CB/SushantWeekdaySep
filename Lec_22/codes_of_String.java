package Lec_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codes_of_String {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String table = scn.next();
		List<String> AL = new ArrayList<>();
		KAAT(table,"",AL);
		System.out.println(AL);
	}

	public static void KAAT(String table, String ans,List<String> AL) {
		if(table.isEmpty()) {
//			System.out.println(ans);
			AL.add(ans);
			return;
		}
		for (int chakku = 1;chakku <= 2 && chakku <= table.length(); chakku++) {
			String piece = table.substring(0,chakku);
			String remain = table.substring(chakku);
			if(isTasty(piece)) {
				int num = Integer.parseInt(piece);
				char ch = (char)(num-1+'a');
				KAAT(remain, ans+ch,AL);
			}
		}
	}
	public static boolean isTasty(String piece) {
		int num = Integer.parseInt(piece);
		if(num<=26) {
			return true;
		}else {
			return false;
		}
	}
}
