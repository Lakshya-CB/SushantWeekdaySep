package Lec_06;

public class Pat_08 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;

		int total_st = n;
		while (row <= n) {
			int cnt_st = 0;
			while (cnt_st < total_st) {
				if (row == cnt_st + 1 || row+cnt_st==n) {
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
