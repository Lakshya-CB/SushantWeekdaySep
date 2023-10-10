package Lec_07;

public class Rotate {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 9;

		int baackup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		System.out.println(nod);
		num = baackup;
//		for(int i=1;i<=)
		int i = 1;
		while (i <= rot % nod) {
			
			int p1 = num / 10;
			int p2 = num % 10;

			num = p1 + p2 * (int) Math.pow(10, nod - 1);
			System.out.println(num);
			
			i++;
		}
	}
}
