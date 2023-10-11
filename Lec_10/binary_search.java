package Lec_10;

public class binary_search {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };

	}

	public static int Find(int[] arr, int ali) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (ali == arr[mid]) {
				return mid;
			} else if (arr[mid] > ali) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return -1;
	}
}
