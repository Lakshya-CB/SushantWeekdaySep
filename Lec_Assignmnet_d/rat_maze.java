package Lec_Assignmnet_d;

import java.util.Scanner;

public class rat_maze {
	static boolean b = false;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();

		char[][] board = new char[r][c];
		for (int i = 0; i < r; i++) {
			board[i] = scn.next().toCharArray();
		}
		solve(0, 0, board);
		if(b==false) {
			System.out.println("NO PATH FOUND");
		}
	}

	private static void solve(int i, int j, char[][] board) {
		if (i<0||j<0||i == board.length || j == board[0].length 
				|| board[i][j] == 'X' || b ||board[i][j] == '1') {
			return;
		}
		if (i == board.length - 1 && j == board[0].length - 1) {
			board[i][j] = '1';
			print(board);
			
			b = true;
			return;
		}
//		print(board);
		board[i][j] = '1';
		solve(i, j + 1, board);
		solve(i + 1, j, board);
		solve(i, j - 1, board);
		solve(i - 1, j, board);
		board[i][j] = '0';
	}

	private static void print(char[][] board) {
		for (char[] row : board) {
			for (char ch : row) {
				if (ch == '1') {
					System.out.print("1 ");
					
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
//		System.out.println("=========");

	}
}
