package Lec_Recursion;

public class rec_multiverse {
	public static void main(String[] args) {
//		coinToss(2, "");
//		climbStairs(0, "");
		climbStairs(0, "", 3);
	}

	public static void coinToss(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		}
		coinToss(n - 1, path + "H");
		coinToss(n - 1, path + "T");
	}

	public static void climbStairs
	(int curr, String path, int dest) {
		if(curr==dest) { // +ve BC
			System.out.println(path);
			return;
		}
		if(curr>dest) { // -ve Bc
			return;
		}
		climbStairs(curr+1, path+1,dest);
		climbStairs(curr+2, path+2,dest);
		
	}
	public static void subSeq(String str, String path) {
		if(str.length()==0) {
			System.out.println(path);
			return;
		}
//		BP : str = "abc",""
//		SP : str = "bc"
		String sp = str.substring(1);
		char ch = str.charAt(0);
		subSeq(sp, path+ch);
		subSeq(sp, path);
		
	}
}
