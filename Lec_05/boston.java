package Lec_05;

public class boston {
	public static void main(String[] args) {
		int num = 22;
		int baackup = num;
		int sum_digits = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			sum_digits = sum_digits + digit;
		}
		int div = 2;
		int prime_sum = 0;
		num = baackup;
		while (num > 1) {
			if (num % div == 0) {
				System.out.println(div);

				num = num / div;
				int copy_div = div;
				while (copy_div > 0) {
					int digit = copy_div % 10;
					copy_div = copy_div / 10;
					prime_sum = prime_sum + digit;
				}

			} else {
				div++;
			}
		}
		if(prime_sum==sum_digits) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}
