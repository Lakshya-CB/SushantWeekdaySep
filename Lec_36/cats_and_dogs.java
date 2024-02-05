package Lec_36;

import java.util.*;

public class cats_and_dogs {
	public static void main(String[] args) {
		String s = "catsandogs";
		String t = "caanat";
//		solve(s, t);
		Linear(s, t);
	}

	public static int solve(String s, String t) {
		int ans = 0;

		HashMap<Character, ArrayList<Integer>> HM = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			ArrayList<Integer> AL = HM.getOrDefault(ch, new ArrayList<>());
			AL.add(i);
			HM.put(ch, AL);
		}
		System.out.println(HM);

		////////////////////////
		int prev = -1;
		for (int i = 0; i < t.length(); i++) {
//			search this char in the string s!!
			char ch = t.charAt(i);
			if (!HM.containsKey(ch)) {
				return -1;
			}
			ArrayList<Integer> AL = HM.get(ch);
			int f = find(AL, prev);
			if (f == -1) {
				prev = AL.get(0);
				ans++;
			} else {
				prev = f;
			}
			System.out.println(ch + "=>" + prev);
			///////////////////////

//			inside my AL, i need an inedx bigger than my prev!!
//			if not exist ans++; and p is the starting char!!
//			boolean flag = false;
//			for (int idx : AL) {
//				if (idx > prev) {
//					prev = idx;
//					flag = true;
//					break;
//				}
//			}
//			if (flag == false) {
//				prev = AL.get(0);
//				ans++;
//			}
//			System.out.println(ch + "=>" + prev);

		}

		return ans;
	}

	public static int find(ArrayList<Integer> AL, int ali_idx) {
		int s = 0;
		int e = AL.size() - 1;
		int f = -1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (AL.get(mid) < ali_idx) {
				s = mid + 1;
			} else {
				f = AL.get(mid); // place!!!?!??!!?!?!?!***
				e = mid - 1;
			}
		}

		return f;

	}

	public static void Linear(String s, String t) {
		int[][] nextOcc = new int[26][s.length()+1];
		
//		for (int j = 0; j < nextOcc.length; j++) {
//			nextOcc[j][nextOcc[0].length-1] = -1;
//		}

		
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = 0; j < nextOcc.length; j++) {
				nextOcc[j][i] = nextOcc[j][i + 1];
			}
			char ch = s.charAt(i);
			nextOcc[ch-'a'][i] = i;
		}
		for(int r =0;r<nextOcc.length;r++) {
			System.out.print((char)(r+'a')+"=>");
			for(int ali : nextOcc[r]) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
	}
}
