package Lec_random_doubts;

import java.util.PriorityQueue;

public class PQ_QPS {
	public static void main(String[] args) {
		int[] arr = {2,5,10,2,3,4,5,1,9,7};
		topK(arr, 3);
	}
	public static void topK(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for(int ali : arr) {
			PQ.add(ali);
			if(PQ.size()>k) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
		
	}
}
