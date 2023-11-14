package Lec_13;

import java.util.Scanner;

public class IIIDD_Seq_gen {
	public static void main(String[] args) {
//		String str = "IIIIIIz";
//		System.out.println(str.length());
//		System.out.println(str.charAt(str.length()-1));
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solve(str);

	}

	public static void solve(String str) {
//		str = "III"
		int[] arr = new int[str.length() + 1];
		int ans = 1;
		int cnt_D = 0;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				int idx = i;
				for (int cnt = 1; cnt <= cnt_D + 1; cnt++) {
					arr[idx] = ans;
					idx--;
					ans++;
				}
				cnt_D = 0;
			} else if (str.charAt(i) == 'D') {
				cnt_D++;
			}
		}
		for(int ali: arr) {
			System.out.print(ali);
		}
	}
}
