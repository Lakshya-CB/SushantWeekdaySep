package Lec_Trees;

public class client_tree {
	public static void main(String[] args) {
		int[] pre = { 10, 20, 40, 50, 30, 60 };
		int[] in = { 40, 20, 50, 10, 30, 60 };
		
		BinaryTree BT = new BinaryTree(pre, in);
		BT.print();
		BT.lvlPrint2();
	}
}
