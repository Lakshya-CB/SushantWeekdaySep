package Lec_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayList_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<>();
//		Wrapper Integer => int wrapper class!!
		System.out.println(AL);
		System.out.println(AL.size());

//		add in your AL!!
		AL.add(AL.size(), 10);
		System.out.println(AL);
		AL.add(AL.size(), 20);
		System.out.println(AL);
		AL.add(AL.size(), 30);
		System.out.println(AL);
		AL.add(40);
		System.out.println(AL);
//		
		AL.add(2, 25);
		System.out.println(AL);
//		indexing in my AL!!
		for (int i = 0; i < AL.size(); i++) {
			System.out.println(AL.get(i));
		}

		for (int ali : AL) {
			System.out.println(ali);
		}

		AL.remove(0);

	}

	public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		ArrayList<Integer> AL = new ArrayList<>();
		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] == arr2[idx2]) {
				if (AL.isEmpty() || AL.get(AL.size() - 1) != arr1[idx1]) {
					AL.add(arr1[idx1]);
				}
				idx1++;
				idx2++;
			} else if (arr1[idx1] < arr2[idx2]) {
				idx1++;
			} else {
				idx2++;
			}
		}
		return AL;
	}

	public static long countMoves(int[] nums, int[] target) {
		Arrays.sort(nums);
		Arrays.sort(target);
		long totalMoves;
//	        creating arraylists here
		ArrayList<Integer> oddNums = new ArrayList<>(nums.length);
		ArrayList<Integer> oddTarget = new ArrayList<>(nums.length);
		ArrayList<Integer> evenNums = new ArrayList<>(nums.length);
		ArrayList<Integer> evenTarget = new ArrayList<>(nums.length);
//	        separating the odd and even elements here.
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenNums.add(nums[i]);
			} else {
				oddNums.add(nums[i]);
			}
			if (target[i] % 2 == 0) {
				evenTarget.add(target[i]);
			} else {
				oddTarget.add(target[i]);
			}
		}
//	        init the vars here
		long positiveCount = 0;
		long negativeCount = 0;
//	        counting the moves here for the even numbers
		for (int i = 0; i < evenNums.size(); i++) {
			if (evenNums.get(i) < evenTarget.get(i)) {
				positiveCount += (evenTarget.get(i) - evenNums.get(i)) / 2;
			} else if (evenNums.get(i) > evenTarget.get(i)) {
				negativeCount += (evenNums.get(i) - evenTarget.get(i)) / 2;
			}
		}
//	        counting the moves here for the odd numbers
		for (int i = 0; i < oddNums.size(); i++) {
			if (oddNums.get(i) < oddTarget.get(i)) {
				positiveCount += (oddTarget.get(i) - oddNums.get(i)) / 2;
			} else if (oddNums.get(i) > oddTarget.get(i)) {
				negativeCount += (oddNums.get(i) - oddTarget.get(i)) / 2;
			}
		}
//	        returning the total moves here
		totalMoves = (positiveCount + negativeCount) / 2;
		return totalMoves;
	}

	}

	public int minOperations(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (2 * i) + 1;
			// System.out.print(arr[i]+" ");
		}

		int i = 0;
		int j = arr.length - 1;
		int count = 0;
		int mid = (i + j) / 2;
		int mid1 = 0;
		if (n % 2 == 0) {
			mid1 = mid + 1;
			while (arr[mid1] != arr[mid]) {
				arr[mid] += 1;
				arr[mid1] -= 1;
				count++;
			}

		}

		while (j<=i) {
			if (arr[i] != arr[mid] && arr[j] != arr[mid]) {
				count++;
				arr[i] += 1;
				arr[j] -= 1;
				// System.out.println(arr[i]+"------->"+arr[mid]+"------->"+arr[j]);
			} else {
				i++;
				j--;
			}
		}

		return count;
	}

	public static int solve(String[] args) {
		int[] nums = { 1, 2, 5 };
		int[] target = { 4, 1, 3 };
		ArrayList<Integer> evenArr1 = new ArrayList<>(nums.length);
		ArrayList<Integer> oddArr1 = new ArrayList<>(nums.length);
		ArrayList<Integer> evenArr2 = new ArrayList<>(nums.length);
		ArrayList<Integer> oddArr2 = new ArrayList<>(nums.length);
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evenArr1.add(nums[i]);
			} else {
				oddArr1.add(nums[i]);
			}
			if (target[i] % 2 == 0) {
				evenArr2.add(target[i]);
			} else {
				oddArr2.add(target[i]);
			}
		}

		Collections.sort(evenArr1);
		Collections.sort(oddArr1);
		Collections.sort(evenArr2);
		Collections.sort(oddArr2);
		int diff = 0;
		int opteration = 0;
		for (int i = 0; i < oddArr1.size(); i++) {
			diff = diff + oddArr1.get(i) - oddArr2.get(i);
			if (oddArr1.get(i) > oddArr2.get(i)) {
				opteration = opteration + (oddArr1.get(i) - oddArr2.get(i)) / 2;
			}
		}
		for (int i = 0; i < evenArr1.size(); i++) {
			diff = diff + evenArr1.get(i) - evenArr2.get(i);
			if (evenArr1.get(i) > evenArr2.get(i)) {
				opteration = opteration + (evenArr1.get(i) - evenArr2.get(i)) / 2;
			}
		}
		if (diff == 0) {
			return opteration;
		} else {
			return -1;
		}
	}
	
}
