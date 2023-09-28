package Lec_05;

public class arm {
	public static void main(String[] args) {
		int num = 1235;
		int baackup = num;
		int nod =0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			nod++;
		}
		System.out.println(nod);
		num = baackup;
		int ans =0;
		while (num > 0) {
			int digit = num % 10;
			System.out.println(digit);
			ans = ans + (int)Math.pow(digit,nod);
			num = num / 10;
			
		}
		System.out.println(ans);
		if(ans==baackup) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
