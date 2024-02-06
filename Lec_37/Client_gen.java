package Lec_37;

import java.util.Comparator;

public class Client_gen {
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("A", 12);
		arr[1] = new Student("B", 15);
		arr[2] = new Student("C", 8);
		arr[3] = new Student("D", 10);
		arr[4] = new Student("E", 13);

		print(arr);
		System.out.println("====");
		sort(arr, new comp() );
		System.out.println("====");
		print(arr);
		
	}
	static class comp implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.Age- o2.Age;
		}
		
	}

//	public static void print(Object[] arr) {
//		for(Object s: arr) {
////			s.
//			System.out.println(s);
//		}
//	}
	public static <pui> void print(pui[] arr) {
		for (pui s : arr) {
//			s.
			System.out.println(s);
		}
	}

	public static <T extends Comparable<T>> void sort(T[] arr) {
		for (int cnt = 1; cnt <= arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 2; s++) {
//				s and s+1!
//				arr[s].compareTo(arr[s+1])
//				if(arr[s].Age>arr[s+1].Age) {
				
				if(arr[s].compareTo(arr[s+1])>0) {
					T temp = arr[s];
					arr[s] = arr[s+1];
					arr[s+1] = temp;
				}
			}
		}
	}
	
	public static <T> void sort(T[] arr , Comparator<T> obj ) {
		for (int cnt = 1; cnt <= arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 2; s++) {
//				s and s+1!
//				obj.
				if(obj.compare(arr[s],arr[s+1])>0) {
					T temp = arr[s];
					arr[s] = arr[s+1];
					arr[s+1] = temp;
				}
			}
		}
	}

}
