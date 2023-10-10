package Lec_08;

public class Fre_C {
	public static void main(String[] args) {
		int minF = 0;
		int maxF = 100;
		int step = 10;

		for (int F = minF; F <= maxF; F = F + step) {
			int C = 5 * F / 9 - 32;
			System.out.println(F + " - " + C);
		}
	}
}
