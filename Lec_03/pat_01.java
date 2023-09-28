package Lec_03;

public class pat_01 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {
			int cnt = 0;
			while (cnt < n) {
				System.out.print("*");
				cnt++;
			}
			System.out.println();
			row++;
		}
	}
}
