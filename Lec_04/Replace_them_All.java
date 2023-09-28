package Lec_04;

public class Replace_them_All {
	public static void main(String[] args) {
		int num = 108402;
		int ans = 0;
		int mult= 1;
		while(num>0) {
			int digit = num%10;
			if(digit==0) {
				digit = 5;
			}
			ans = ans + digit*mult;
			
//			System.out.println(digit);
			num = num/10;
			mult = mult*10;
		}
		System.out.println(ans);
	}
}
