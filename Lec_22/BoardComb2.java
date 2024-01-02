package Lec_22;

public class BoardComb2 {
	public static void main(String[] args) {
		int N = 4;
		chess(0, 0, N, "", new boolean[N][N]);
	}

	public static void chess(int r, int c, int QTP, String path, boolean board[][]) {
		if (QTP == 0) {
			System.out.println(path);
			print(board);
			return;
		}
		if (c == board[0].length) {
			r++;
			c = 0;
		}
		if (r == board.length) {
			return;
		}
		if (isSafe(r, c, board)) {
			board[r][c] = true;
			chess(r, c + 1, QTP - 1, path + "Q{" + r + "," + c + "}", 
					board);
			board[r][c] = false;
		}

		chess(r, c + 1, QTP, path, board);

	}

	private static boolean isSafe(int r, int c, boolean[][] board) {
		// TODO Auto-generated method stub
		for (int R = 0; R < r; R++) {
			if (board[R][c]) {
				return false;
			}
		}
		for (int C = 0; C < c; C++) {
			if (board[r][C]) {
				return false;
			}
		}
		int R0 = r;
		int C0 = c;
		while (R0 >= 0 && C0 >= 0) {
			if (board[R0][C0]) {
				return false;
			}
			R0--;
			C0--;
		}
		int R1 = r;
		int C1 = c;
		while (R1 >= 0 && C1 < board[0].length) {
			if (board[R1][C1]) {
				return false;
			}
			R1--;
			C1++;
		}
		return true;
	}

	private static void print(boolean[][] board) {
		// TODO Auto-generated method stub
		for (boolean[] row : board) {
			for (boolean b : row) {
				if (b) {
					System.out.print("# ");
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();
		}
		System.out.println("=================");
	}

}
