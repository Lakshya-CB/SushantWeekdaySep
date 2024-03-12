package Lec_HM_Bit_Trie;

public class Bit_masking_basics {
	public static void main(String[] args) {
//		byte b = (byte)128;
//		System.out.println(b);
//		
//		byte b = (byte)128;
//		System.out.println(Integer.toBinaryString(b));
		int a = -12;
		int b = 1;
//		System.out.println(a | b);
//		System.out.println(a & b);
		System.out.println(a | 0);
		System.out.println(a & (~0));
		System.out.println(a << 4);
		a = -10;
		System.out.println(a >>> b);

	}

	public static int ChangeIthBit1(int x, int i) {
		int mask = 1 << i;
		return x | mask;
	}

	public static int ChangeIthBit0(int x, int i) {
		int mask = ~(1 << i);
		return x & mask;
	}

	public static int ChangeIthToggle(int x, int i) {
		int mask = 1 << i;
		return x | mask;
	}

	public static int RightMostSetBit(int x) {
		int mask = 1;
		while (true) {
			if ((mask & x) > 0) {
				return mask;
			}
			mask = mask << 1;
		}
	}

	public static int KernNighans(int x) {
		return x & -x;
	}
}
