package Lec_LL;

public class LinkedList_demo {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.add(10);
		LL.add(20);
		LL.add(30);
		LL.add(40);
		LL.add(50);
		LL.add(60);
		LL.add(70);
		LL.add(80);
		LL.add(90);
		LL.print();
//		LL.Rev2();
		LL.revK_Iter(3);
		LL.print();
		

	}
}
