package Lec_03;

import java.util.Scanner;

public class make_num_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cnt = 1;
		int ans=0;
		int mult = 1;
		while(cnt<=n) {
			int digit  = scn.nextInt();
			ans = ans +digit*mult;
			mult = mult*10;
			cnt=cnt+1;
		}
		System.out.println(ans);
		
	}
}
