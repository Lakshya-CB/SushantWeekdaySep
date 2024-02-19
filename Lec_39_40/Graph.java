package Lec_39_40;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
//HashMap<V1, Nbrs>
//	HashMap<V1,HashMap<V2,Wt>>
	HashMap<Integer, HashMap<Integer, Integer>> HM;

	public Graph(int people) {
		HM = new HashMap<>();
		for (int cnt = 1; cnt <= people; cnt++) {
			HM.put(cnt, new HashMap<>());
		}

	}

	public void addEdge(int V1, int V2, int wt) {
		HashMap<Integer, Integer> Nbrs_V1 = HM.get(V1);
		HashMap<Integer, Integer> Nbrs_V2 = HM.get(V2);
		Nbrs_V1.put(V2, wt);
		Nbrs_V2.put(V1, wt);
	}

	public void removeEdge(int V1, int V2) {
		HashMap<Integer, Integer> Nbrs_V1 = HM.get(V1);
		HashMap<Integer, Integer> Nbrs_V2 = HM.get(V2);
		Nbrs_V1.remove(V2);
		Nbrs_V2.remove(V1);
	}

	public boolean IsNbr(int V1, int V2) {
		return HM.get(V1).containsKey(V2);
	}

	public void hasPath(int src, int dest) {
		hasPath(src, dest, "", new HashSet<>());
	}

	private void hasPath(int src, int dest, String path, HashSet<Integer> Visited) {
		if (src == dest) {
			System.out.println(path + " " + dest);
			return;
		}
		Visited.add(src);
		for (int nbr : HM.get(src).keySet()) {
			if (!Visited.contains(nbr)) {
				hasPath(nbr, dest, path + " " + src, Visited);
			}
		}
		Visited.remove(src);
	}

	public void BFS(int src) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(src);
		HashSet<Integer> Visited = new HashSet<>();
		while (!Q.isEmpty()) {
			int curr = Q.poll();
			if (Visited.contains(curr)) {
				System.out.println("cycle!!!");
				continue;
			}
			Visited.add(curr);
			System.out.println(curr);
			for (int nbr : HM.get(curr).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
	}

	public void BFT() {
		int numOfComp = 0;
		HashSet<Integer> Visited = new HashSet<>();
		for (int V : HM.keySet()) {

			if (Visited.contains(V)) {
				continue;
			}
			numOfComp++;
			Queue<Integer> Q = new LinkedList<>();
			Q.add(V);
			while (!Q.isEmpty()) {
				int curr = Q.poll();
				if (Visited.contains(curr)) {
					System.out.println("cycle!!!");
					continue;
				}
				Visited.add(curr);
				System.out.println(curr);
				for (int nbr : HM.get(curr).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
		}
		System.out.println("=>" + numOfComp);
	}

	class dijPair implements Comparable<dijPair> {
		public dijPair(int V, int d) {
			this.V = V;
			distV = d;
		}

		int V;
		int distV;

		@Override
		public int compareTo(dijPair o) {
//			this - o
//			A.compareTo(B)
//			A-B;
			// TODO Auto-generated method stub
			return this.distV - o.distV;
		}
	}

	public void Dijkstra(int src) {
		PriorityQueue<dijPair> PQ = new PriorityQueue<>();
		HashSet<Integer> Visited = new HashSet<>();
		PQ.add(new dijPair(src, 0));
		while (!PQ.isEmpty()) {
			dijPair curr = PQ.poll();
			System.out.println(curr.V + "=>" + curr.distV);
			Visited.add(curr.V);
			for (int nbr : HM.get(curr.V).keySet()) {
				if (!Visited.contains(nbr)) {
					dijPair dj = new dijPair(nbr, curr.V + edge(nbr, curr.V));
					PQ.add(dj);
				}
			}
		}
	}

	public int edge(int V1, int V2) {
		return HM.get(V1).get(V2);
//		mat[V1][V2]
	}
}
