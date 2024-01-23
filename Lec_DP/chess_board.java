package Lec_DP;

public class chess_board {
	public static void main(String[] args) {
		move(0, 0, "{0-0}", 3);
	}

	public static void move(int r, int c, String path, int N) {
		if(r>=N||c>=N) {
			return;
		}
		if(r==N-1 && c==N-1) {
			System.out.println(path);
			return;
		}
//		System.out.println(path);
		move(r + 2, c + 1, path + "K{" + (r + 2) + "-" + (c + 1) + "}", N);
		move(r + 1, c + 2, path + "K{" + (r + 1) + "-" + (c + 2) + "}", N);
		if (r == 0 || r == N - 1 || c == 0 || c == N - 1) {
			for (int C = c + 1; C < N; C++) {
				move(r, C, path + "R{" + r + "-" + C + "}", N);
			}
			for (int R = r + 1; R < N; R++) {
				move(R, c, path + "R{" + R + "-" + c + "}", N);
			}
			
		}
		if (r == c || r + c == N - 1) {
			int R = r + 1;
			int C = c + 1;
			while (R < N && C < N) {
				move(R, C, path+"B{"+R+"-"+C+"}", N);
				R++;C++;
			}
		}

	}
}
