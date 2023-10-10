package Lec_06;

public class Pat_07 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;

		int total_st = n;
		while (row <= n) {
			int cnt_st = 0;
			while (cnt_st < total_st) {
				if (row == 1 || row == n || 
						cnt_st == 0 || cnt_st == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cnt_st++;
			}
			row++;
			System.out.println();
		}
	}
}
