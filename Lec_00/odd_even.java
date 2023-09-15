package Lec_00;

public class odd_even {
	public static void main(String[] args) {
		int num = 17;
		int Q = num / 2;
		int R = num % 2;
		System.out.println(Q);
		System.out.println(R);
		if(R==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
	}
}
