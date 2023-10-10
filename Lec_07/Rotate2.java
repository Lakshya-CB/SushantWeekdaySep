package Lec_07;

public class Rotate2 {
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
		rot = rot%nod;
		//////////////////////
		int divisor = (int)Math.pow(10, rot);
		int p1 = num/divisor;
		int p2 = num%divisor;
		int mult = (int)Math.pow(10,nod-rot);
		System.out.println(p2*mult+p1);
	}
}
