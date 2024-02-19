package Lec_39_40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class word_ladder {
	public int ladderLength(String bW, String eW, List<String> wordList) {
		HashSet<String> List_Set = new HashSet<>(wordList);
		Queue<String> Q = new LinkedList<>();
		Queue<Integer> Q_lvl = new LinkedList<>();

		Q.add(bW);
		Q_lvl.add(0);
		HashSet<String> Visited = new HashSet<>();
		while (!Q.isEmpty()) {
			String V = Q.poll();
			int curr_lvl = Q_lvl.poll();
			for (String nbr : getNbrs(V, List_Set)) {
				if (nbr.equals(eW)) {
					return curr_lvl + 1;
				}
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
					Q_lvl.add(curr_lvl + 1);
				}
			}

		}
		return 0;
	}

	private List<String> getNbrs(String v, HashSet<String> list_Set) {
//		v=> "abc"
		List<String> AL = new ArrayList<>();
		StringBuilder sb = new StringBuilder(v);
		for (int i = 0; i < v.length(); i++) {
//			varry sb[i] = > a to z!!
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (ch != v.charAt(i)) {
					
					sb.setCharAt(i, ch);
					String temp = sb.toString();
					if(list_Set.contains(temp)) {
						AL.add(temp);
					}
				}
			}
		}
		return AL;
	}
}
