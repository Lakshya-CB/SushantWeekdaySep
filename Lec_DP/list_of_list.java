package Lec_DP;

import java.util.ArrayList;
import java.util.List;

public class list_of_list {
	public static void main(String[] args) {
//	List<Integer> AL = new ArrayList<>();
		List<List<Integer>> Biggy = new ArrayList<>();
		
		List<Integer> AL = new ArrayList<Integer>();
		AL.add(10);
		Biggy.add(new ArrayList<>(AL));
		//////////////////////
		AL.add(20);
		Biggy.add(new ArrayList<>(AL));
		//////////////////////
		AL.add(30);
		Biggy.add(new ArrayList<>(AL));
		//////////////////////
		AL.add(40);
		Biggy.add(new ArrayList<>(AL));
		
		System.out.println(Biggy);
	}
}
