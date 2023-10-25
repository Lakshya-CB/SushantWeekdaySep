package Lec_11;

public class Majority_element {
	public static void main(String[] args) {

	}
	public static void jang(int[] arr) {
		int surv = arr[0];
		int freq = 0;
		for(int ali: arr) {
			if(freq==0) {
				surv = ali;
			}
			
			if(ali==surv) {
				freq++;
			}else {
				freq--;
			}
		}
	}
}
