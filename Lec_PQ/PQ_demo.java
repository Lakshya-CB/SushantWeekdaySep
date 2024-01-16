package Lec_PQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ = 
				new PriorityQueue<>();
		// Min heap, Rank ke respect!!
		PQ.add(10);
		PQ.add(12);
		
		PQ.add(100);
		PQ.add(2);
		PQ.add(5);
		System.out.println(PQ);

//		System.out.println(PQ.poll());
//
//		System.out.println(PQ.poll());
//		System.out.println(PQ.poll());
//		System.out.println(PQ.poll());

	}
}
