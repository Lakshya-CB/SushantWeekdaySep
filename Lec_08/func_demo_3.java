package Lec_08;

public class func_demo_3 {
	static int global = 100;
	
	public static void main(String[] args) {

		int a = 1;
		int b = 20;
		System.out.println(a + " : " + b);
		swap(a, b);
		System.out.println(a + " : " + b);
		System.out.println(global);
	}

	public static void swap(int a, int b) {
		System.out.println(global);
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
	}

}
