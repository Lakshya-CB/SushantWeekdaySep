package Lec_03;

public class prime_fact {
	public static void main(String[] args) {
		int n = 60;
		int div = 2;
		while (n > 1) {
			if (n % div == 0) {
				System.out.println(div);
				n = n / div;
			} else {
				div = div + 1;
			}
		}
	}
}
