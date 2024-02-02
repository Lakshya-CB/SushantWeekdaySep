package Lec_Assignmnet_d;

import java.util.HashMap;
import java.util.Scanner;

public class exchanging_coins {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(solve(scn.nextInt(),new HashMap<>()));
	}
	public static long solve(int n, HashMap<Integer,Long> HM) {
		if(n==0) {
			return 0;
		}
		if(HM.containsKey(n)) {
			return HM.get(n);
		}
		long sp1 = solve(n/2,HM);
		long sp2 = solve(n/3,HM);
		long sp3 = solve(n/4,HM);
		HM.put(n, Math.max(sp1+sp2+sp3,n));
		return Math.max(sp1+sp2+sp3,n);
	}
}
