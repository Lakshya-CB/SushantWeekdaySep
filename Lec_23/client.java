package Lec_23;

import java.util.ArrayList;

public class client {
	public static void main(String[] args) {
//		Child C = new Child();
//		C.funcP();
//		System.out.println(C.dataP);
		Parent p = new Parent();

		Child C = new Child();
		System.out.println(C.dataP);
		System.out.println(C.dataC);
		System.out.println(C.data);
		System.out.println(((Parent) C).data);

//		//////
		C.funC();
		C.funP();
		C.fun();
		((Parent)C).fun();
		///////////////
		Parent p2 = new Child();
		p2.fun();
//		p2.
//		Child C2 = new Parent();
//		C2.funC();
//		System.out.println(p);
		System.out.println(C);
//		Object x = new Parent();
		
		ArrayList<Integer> AL =new ArrayList<>();
		AL.add(10);
		System.out.println(AL);
		
	}
}
