package Lec_39_40;

public class Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(1, 4, 6);
		G.addEdge(1, 2, 10);
		G.addEdge(2, 3, 2);
		G.addEdge(3, 4, 3);
		G.addEdge(5, 4, 10);
		G.addEdge(5, 6, 9);
		G.addEdge(5, 7, 15);
		G.addEdge(6, 7, 13);
		
		G.hasPath(1, 7);
//		G.removeEdge(4, 5);
//		G.BFS(1);
		G.BFT();
//		System.out.println(G.HM);
		G.Dijkstra(1);
	}
}
