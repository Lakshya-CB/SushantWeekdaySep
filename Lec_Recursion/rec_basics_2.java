package Lec_Recursion;

public class rec_basics_2 {
	public static void main(String[] args) {
//		System.out.println(pow(10, 3));
		System.out.println(Fibo(4));
	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
//		BP : (10,b)
//		SP : (10,b-1)
		int sp = pow(a, b - 1);
		return sp * a;
	}

	public static int Fibo(int n) {
//	Fib(n)	
//	SP : F(n-1) F(n-2)
		if(n<=1) {
			return n;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1+sp2;
	}
}
