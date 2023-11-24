package Lec_array_doubts_hard;

import java.util.Arrays;

public class DDII_min_number {
	public static void main(String[] args) {
		solve("III");
	}

	public static void solve(String str) { // III 
		int[] arr = new int[str.length() + 1];
		int ans = 1;
		int cnt_Ds = 0;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				int idx = i;
				for(int cnt= 1;cnt<=cnt_Ds+1;cnt++) {
					arr[idx] = ans;
					idx--;
					ans++;
				}
				cnt_Ds=0;
			}else if( str.charAt(i) == 'D') {
				cnt_Ds++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
