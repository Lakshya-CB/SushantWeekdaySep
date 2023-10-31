package Lec_12;

public class Nth_root_M {
	public static void main(String[] args) {
		double ans = Math.pow(343, 1.0 / 3);
		System.out.println(ans);
		if (ans - (int) ans > 0.9999) {
			ans = (int) ans + 1;
		}
		System.out.println(ans);
	}

	public static int BS(int M, int N) {
		int s = 1;
		int e = M;
		int ans = -1;
		while (s <= e) {
			int x = (s + e) / 2;
			if (Math.pow(x, N) <= M) {
				ans = x;
				s = x + 1;
			} else {
				e = x - 1;
			}
		}
		if (Math.pow(ans, N) == M) {
			return (int) ans;
		} else {
			return -1;
		}
	}

	public static boolean moolchand(int given_time, int[] cooks, int total_Para_ordered) {
		int total_cookedPs_till_now = 0;
		for (int cook : cooks) {
			int time_total = 0;
			int cnt = 1;
			while (true) {
				int pu_time = cnt * cook;
				if (time_total + pu_time <= given_time) {
					total_cookedPs_till_now++;
					time_total = time_total + pu_time;
					cnt++;
				} else {
					break;
				}
			}
		}
		return total_cookedPs_till_now >= total_Para_ordered;
	}
}
