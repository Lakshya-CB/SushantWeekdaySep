package Lec_08;

public class func_demo {
	public static void main(String[] args) {
		naacho();
		System.out.println("gaane");
		naacho();
		int ans = add(10, 20);
//		add3(10, 20, 30);
	}

	public static void naacho() {
		System.out.println("naacho!");
	}

	public static int add(int a, int b) {
		System.out.println(a + b);
		return a+b;
	}

	public static int add3(int a, int b, int c) {
		System.out.println(a + b + c);
		return 5;
	}
}
