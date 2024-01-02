package Lec_22;

public class BoardComb {
	public static void main(String[] args) {
		int N = 3;
		place(0, 0, N, "", N, N);
	}

	public static void place(int r, int c, 
			int QTP, String path, 
			int tR, int tC) {
		if (QTP == 0) {
			System.out.println(path);
			return;
		}
		if (c == tC) {
			r++;
			c = 0;
		}
		if(r==tR) {
			return;
		}

		place(r, c + 1, QTP - 1, path + "Q{" + r + "," + c + "}", tR, tC);
		place(r, c + 1, QTP, path, tR, tC);

	}

}
