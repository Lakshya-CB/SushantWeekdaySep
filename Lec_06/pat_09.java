package Lec_06;

public class pat_09 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_sp = n-1;
		int total_st = 1;
		while (row <= n) {
//			Step 2: space
			int cnt_sp =0;
			while(cnt_sp<total_sp) {
				System.out.print(" ");
				cnt_sp++;
			}
//			Step 2: star!!
			int cnt_st =0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
			row++;
			total_sp--;
			total_st++;
			System.out.println();
		}
	}
}
