package Lec_22;

public class blocked_maze {
	public static void main(String[] args) {
		int[][] board = {
				{ 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0 },
				{ 0, 1, 0, 0 }, 
				{ 0, 0, 1, 0 }, };
		
		move(0, 0, "", board, new boolean[board.length][board[0].length]);
	}

	public static void move(int r, int c, String path, 
			int[][] board,boolean[][] Visited) {
		
		if(r==board.length-1 && c==board[0].length-1) {
			System.out.println(path);
			return;
		}
		if (r == board.length || c == board[0].length ||
				r<0||c<0||board[r][c] == 1|| Visited[r][c]) {
			return;
		}
		Visited[r][c] = true;
		move(r - 1, c, path + "U", board,Visited); // UP
		move(r + 1, c, path + "D", board,Visited); // down
		move(r, c - 1, path + "L", board,Visited); // right		
		move(r, c + 1, path + "R", board,Visited); // right
		Visited[r][c] = false;

	}
}
