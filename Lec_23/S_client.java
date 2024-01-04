package Lec_23;

public class S_client {
	public static void main(String[] args) {
		Stack S = new Dynamic_Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.print();
		System.out.println(S.pop());
//		Rev(S);
//		S.print();
		S.add(50);
		S.add(60);
		S.add(70);
		S.print();
	}

	public static void Rev(Stack S) {
		Stack E1 = new Stack();
		while (!S.isEmpty()) {
			E1.add(S.pop());
		}

		Stack E2 = new Stack();
		while (!E1.isEmpty()) {
			E2.add(E1.pop());
		}

		while (!E2.isEmpty()) {
			S.add(E2.pop());
		}
	}
}
