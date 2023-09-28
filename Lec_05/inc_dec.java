package Lec_05;

import java.util.Scanner;

public class inc_dec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int prev = Integer.MAX_VALUE;
		int phase = 0; // dec phase!!
		int ans = 1;
		while (N > 0) {
			int curr = scn.nextInt();
			if (phase == 0 && curr > prev) {
				phase = 1;
			}
			if(phase ==1 && curr<prev) {
				ans =0;
			}
			if(curr==prev) {
				ans =0;
			}
//			System.out.println(curr + " - " + prev + " => " + phase);
			prev = curr;
			N--;
		}
		if(ans==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
