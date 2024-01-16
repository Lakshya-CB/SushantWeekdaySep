package Lec_random_doubts;

public class Dictionary_order {
	public static void main(String[] args) {
		String str = "abzcbac";

		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
		}
		solve(str, "", freq);
	}

	public static void solve(String org, String curr, 
			int[] freq) {
//		if(curr.compareTo(org)>0) {
//			return;
//		}
		if(curr.compareTo(org.substring(0,curr.length()))<0) {
			return;
		}
		boolean b = false;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				b = true;
				char ch = (char) (i + 'a');
				freq[i]--;
				solve(org, curr+ch, freq);
				freq[i]++;
			}
		}
		if(b==false) {
			System.out.println(curr);
		}
		
	}
}
