package Lec_Recursion;

public class rec_basics {
	public static void main(String[] args) {
//		PD(4);
//		PI(4);
		PDI(4);
	}
	public static void PDI(int n) {
		if(n==0) {
			return;
		}
//		BP : PDI(n)
//		SP : PDI(n-1);
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
		
	}
	public static void PI(int n) {
		if(n==0) { // sAmllest problem/baSE case
			return;
		}
//		BP : PI(n)
//		SP : PI(n-1)
		PI(n-1);
		System.out.println(n);
	}
	public static void PD(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
//	BP : PD(n)
//	SP : PD(n-1)
		System.out.println(n);
		PD(n - 1);
	}
}
