package Lec_08;

public class armstrong_ {
	public static void main(String[] args) {
		int n = 1000;
		printAllArmstrong(n);
	}

	public static void printAllArmstrong(int n) {
		for (int i = 1; i <= n; i++) {
			if (isArm(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArm(int num) {
		int nod = numOfDigit(num);
		int sum = 0;
		int baackup = num;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, nod);
			num = num / 10;
		}
		if (sum == baackup) {
			return true;
		} else {
			return false;
		}
	}

	public static int numOfDigit(int num) {
		int s = 0;
		while (num > 0) {
			num = num / 10;
			s++;
		}
		return s;
	}
}
