package Lec_01;

public class SumOfNat {
	public static void main(String[] args) {
		int cnt = 0;
		int n = 5;
		int sum =0;
		while (cnt < n) {
			sum = sum + cnt;
			cnt = cnt + 1;			
			System.out.println(cnt);
		}
		System.out.println(sum);
	}
}
