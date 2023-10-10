package Lec_08;

public class func_demo_4 {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println(func_demo_4.val);
		fun(20);
	}

	public static void fun(int a) {
		System.out.println(val);
		int val = 20;
		System.out.println(val);
		System.out.println(func_demo_4.val);
		val = val + 60;
		func_demo_4.val = val + 10;
		System.out.println(val);
		System.out.println(func_demo_4.val);
	}

}
